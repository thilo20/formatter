package formatter;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;

import com.google.googlejavaformat.java.Formatter;
import com.google.googlejavaformat.java.FormatterException;

public class App {

	/**
	 * Formats given file using the official google-java-format tool.
	 * 
	 * @param args input filename
	 */
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Usage: " + App.class.getName() + " <sourcefile>");
			return;
		}

		File file = new File(args[0]);
		File outFile = new File("formatted.java");
		File outFile2 = new File("formattedWithImports.java");

		try {
			String content = new String(Files.readAllBytes(file.toPath()), Charset.forName("UTF-8"));

			// apply formatter
			String formattedSource = new Formatter().formatSource(content);
			byte[] strToBytes = formattedSource.getBytes();
			Files.write(outFile.toPath(), strToBytes);

			// apply formatter with "fix imports" 
			formattedSource = new Formatter().formatSourceAndFixImports(content);
			strToBytes = formattedSource.getBytes();
			Files.write(outFile2.toPath(), strToBytes);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (FormatterException e) {
			e.printStackTrace();
		}

	}

}
