package formatter;

import java.io.File;
import java.io.*; //wildcard
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Scanner; //unused

import com.google.googlejavaformat.java.Formatter;
import com.google.googlejavaformat.java.FormatterException;

/** This is sample java source code used for testing the google-java-format tool.
 * It is not formatted consistently - on purpose.
 Diff with output file.
 */
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

			byte[] strToBytes =     formattedSource.getBytes();

			Files.write(outFile.toPath(), strToBytes);

			System.out.println("done. "+System.getProperty("user.dir"));

} catch (IOException e) {
	e.printStackTrace();
		} catch (FormatterException e) {
			e.printStackTrace();
		}

	}

}
