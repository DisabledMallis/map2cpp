package io.github.disabledmallis.map2cpp;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileHelper {

	public static void writeFile(String toWrite, String content) throws IOException {
		writeFile(new File(toWrite), content);
	}

	// Function to write a string to a file, as well as make it if it doesn't exit
	public static void writeFile(File toWrite, String content) throws IOException {
		if(!toWrite.exists()) {
			toWrite.createNewFile();
		}
		toWrite.setWritable(true);

		Files.writeString(toWrite.toPath(), content);
	}
}
