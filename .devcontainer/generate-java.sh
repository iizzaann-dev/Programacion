#!/bin/bash

FILE="$1"

# si ya tiene contenido no hacer nada
[ -s "$FILE" ] && exit 0

CLASS=$(basename "$FILE" .java)

DIR=$(dirname "$FILE")

PACKAGE=$(echo "$DIR" | sed 's|.*/src/||' | tr '/' '.')

if [[ "$PACKAGE" == "$DIR" ]]; then
  PACKAGE=""
fi

{
[ -n "$PACKAGE" ] && echo "package $PACKAGE;"
echo ""
echo "public class $CLASS {"
echo ""
echo "    public static void main(String[] args) {"
echo "        "
echo "    }"
echo ""
echo "}"
} > "$FILE"