package formatter;

import com.google.googlejavaformat.java.Formatter;
import com.google.googlejavaformat.java.FormatterException;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;

public class App {

  /**
   * Formats given file using the official google-java-format tool.
   *
   * @param args input filename
   */
  public static void main(String[] args) {
    File file = new File(args[0]);
    File outFile = new File(args[0] + ".out");

    try {
      String content = new String(Files.readAllBytes(file.toPath()), Charset.forName("UTF-8"));

      // apply formatter
      String formattedSource = new Formatter().formatSource(content);

      byte[] strToBytes = formattedSource.getBytes();

      Files.write(outFile.toPath(), strToBytes);

    } catch (IOException e) {
      e.printStackTrace();
    } catch (FormatterException e) {
      e.printStackTrace();
    }
  }
}
