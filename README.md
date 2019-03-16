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

Compared to sourcefile.java ..
- solves most of the awkward, annoying inconsistencies
- makes the source code readable without distraction
- converts tabs2spaces  

## formattedWithImports.java
matches javadoc:
Formats an input string (a Java compilation unit) and fixes imports. 
Fixing imports includes ordering, spacing, and removal of unused import statements.

Diff result: strict alphabetical imports look weird, no spacing.

Official ruleset:
https://google.github.io/styleguide/javaguide.html#s3.3-import-statements

### remarks per line:

- line 5: The tool does not resolve wildcard imports automatically.
https://google.github.io/styleguide/javaguide.html#s3.3.1-wildcard-imports

- line 9: unused imports are cleaned up. Strange: Line comment get's preserved.

- line 12: javadoc comment formatted, compacted (line break removed).

- line 32: excess space removed

- line 36: space inserted around '+'

- line 38: indentation corrected