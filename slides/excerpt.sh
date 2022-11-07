#!/bin/sh
pandoc \
  --from gfm --to html5 --embed-resources --standalone \
  --metadata pagetitle="Python for Java Developers" \
  --output ./dist/excerpt.html --css ./excerpt.css \
  --resource-path=.:./content \
  ./content/m00_intro.md \
  ./content/m01_what_is_python.md \
  ./content/m02_installation.md \
  ./content/m03_syntax_primer.md \
  ./content/m04_data_types.md \
  ./content/m05_collections.md \
  ./content/m06_input_and_output.md \
  ./content/m07_examples.md \
  ./content/m08_functions.md \
  ./content/m09_classes.md \
  ./content/m10_code_organization.md \
  ./content/m11_libraries.md \
  ./content/m12_zen_of_python.md
