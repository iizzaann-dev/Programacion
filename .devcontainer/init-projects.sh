#!/bin/bash

ROOT="JavaDocs"

for dir in "$ROOT"/*; do
  [ -d "$dir" ] || continue

  name=$(basename "$dir")

  mkdir -p "$dir/src" "$dir/bin" "$dir/lib"

  # limpiar basura
  rm -rf "$dir/src/com" "$dir/src/app" 2>/dev/null

  # .project
  if [ ! -f "$dir/.project" ]; then
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

  # .classpath
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

  # .gitignore personalizado
  if [ ! -f "$dir/.gitignore" ]; then
cat > "$dir/.gitignore" <<EOF
bin/
*.class
.settings/
EOF
  fi

done