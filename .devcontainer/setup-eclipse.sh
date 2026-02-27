#!/bin/bash

# Recorre todas las carpetas dentro de JavaDocs
for dir in JavaDocs/*; do
    if [ -d "$dir" ]; then
        # Crear estructura mínima si no existe
        [ ! -d "$dir/src" ] && mkdir -p "$dir/src"
        [ ! -d "$dir/bin" ] && mkdir -p "$dir/bin"

        # Crear archivos de Eclipse si no existen
        if [ ! -f "$dir/.classpath" ]; then
            cat > "$dir/.classpath" <<EOF
<?xml version="1.0" encoding="UTF-8"?>
<classpath>
  <classpathentry kind="src" path="src"/>
  <classpathentry kind="con" path="org.eclipse.jdt.launching.JRE_CONTAINER"/>
  <classpathentry kind="output" path="bin"/>
</classpath>
EOF
        fi

        if [ ! -f "$dir/.project" ]; then
            name=$(basename "$dir")
            cat > "$dir/.project" <<EOF
<?xml version="1.0" encoding="UTF-8"?>
<projectDescription>
  <name>$name</name>
  <buildSpec></buildSpec>
  <natures>
    <nature>org.eclipse.jdt.core.javanature</nature>
  </natures>
</projectDescription>
EOF
        fi

        # Crear Main.java de ejemplo con paquete automático
        MAIN_FILE="$dir/src/com/app/Main.java"
        mkdir -p "$(dirname "$MAIN_FILE")"
        if [ ! -f "$MAIN_FILE" ]; then
            bash .devcontainer/generate-java.sh "$MAIN_FILE"
        fi
    fi
done