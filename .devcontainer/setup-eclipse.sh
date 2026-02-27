#!/bin/bash

# Carpeta contenedora de proyectos
ROOT="JavaDocs"

# Detectar versión de Java instalada
JAVA_VERSION=$(java -version 2>&1 | awk -F '"' '/version/ {print $2}')
echo "Usando Java $JAVA_VERSION en todos los proyectos"

# Recorre todas las carpetas dentro de JavaDocs
for dir in "$ROOT"/*; do
  # Solo procesar si es carpeta y contiene src o bin (indicativo de proyecto Java)
  if [ -d "$dir" ] && ( [ -d "$dir/src" ] || [ -d "$dir/bin" ] ); then
    echo "Configurando proyecto: $dir"

    # Crear src y bin si no existen
    mkdir -p "$dir/src" "$dir/bin"

    # Crear .classpath si no existe
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

    # Crear .project si no existe
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
  else
    echo "Ignorando carpeta no válida: $dir"
  fi
done

echo "✅ Todos los proyectos listos para Eclipse"