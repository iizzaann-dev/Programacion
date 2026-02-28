#!/bin/bash

ROOT="JavaDocs"

for dir in "$ROOT"/*; do
  [ -d "$dir" ] || continue

  mkdir -p "$dir/src" "$dir/bin" "$dir/lib"

  # .project
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

  # .classpath
  if [ ! -f "$dir/.classpath" ]; then
    echo '<?xml version="1.0" encoding="UTF-8"?>' > "$dir/.classpath"
    echo '<classpath>' >> "$dir/.classpath"
    echo '<classpathentry kind="src" path="src"/>' >> "$dir/.classpath"
    echo '<classpathentry kind="con" path="org.eclipse.jdt.launching.JRE_CONTAINER"/>' >> "$dir/.classpath"

    for jar in "$dir"/lib/*.jar; do
      [ -f "$jar" ] && echo "<classpathentry kind=\"lib\" path=\"lib/$(basename "$jar")\"/>" >> "$dir/.classpath"
    done

    echo '<classpathentry kind="output" path="bin"/>' >> "$dir/.classpath"
    echo '</classpath>' >> "$dir/.classpath"
  fi

done