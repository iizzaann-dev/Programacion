#!/bin/bash

for dir in JavaDocs/*; do
  if [ -d "$dir" ]; then
    mkdir -p "$dir/src" "$dir/bin"

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
  fi
done