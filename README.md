# formatter
This project tests the official Google-java-format tool, see https://github.com/google/google-java-format.
It uses the formatter as a library.

Usage:
- run App <sourcefile>
	- configure working dir as: ${workspace_loc:formatter}/tests
- creates formatted output file
- diff files for changes

Recommend reading: 
- "the guide" https://google.github.io/styleguide/javaguide.html 
- "the tool" https://github.com/google/google-java-format

IntelliJ plugin issues:
- https://github.com/google/google-java-format#intellij
- https://plugins.jetbrains.com/plugin/8527-google-java-format


# results

See subdir tests/ for sample input and generated files.

## formatted.java
converts tabs2spaces compared to sourcefile.java

## formattedWithImports.java
matches javadoc:
Formats an input string (a Java compilation unit) and fixes imports. 
Fixing imports includes ordering, spacing, and removal of unused import statements.

Diff result: strict alphabetical imports look weird, no spacing.

Official ruleset:
https://google.github.io/styleguide/javaguide.html#s3.3-import-statements