#!/bin/bash
FILE="$1"

# Solo procesar archivos .java vacíos
if [[ "$FILE" == *.java && ! -s "$FILE" ]]; then
    PACKAGE=$(echo "$FILE" | sed -E 's|.*src/([^/]+(/[^/]+)*)/[^/]+\.java|\1|' | tr '/' '.')
    CLASSNAME=$(basename "$FILE" .java)

    [ -z "$PACKAGE" ] && PACKAGE="com.app"

    cat > "$FILE" <<EOF
package $PACKAGE;

public class $CLASSNAME {
    public static void main(String[] args) {
        System.out.println("Clase $CLASSNAME lista");
    }
}
EOF
    echo "✔ Archivo $FILE generado con paquete $PACKAGE y clase $CLASSNAME"
fi