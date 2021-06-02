package io.github.disabledmallis.map2cpp;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class SourceGen {

	String sourceDir;

	public SourceGen(String sourceDir) {
		this.sourceDir = sourceDir;
	}

	// Read the JNIUtil.h file from resources and dump it to disk.
	public String getJniUtilSource() {
		InputStream is = getClass().getClassLoader().getResourceAsStream("JNIUtil.h");
		byte[] bytes;
		try {
			bytes = is.readAllBytes();
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
		return new String(bytes);
	}

	// Generate the class file for a MappedClass
	public void generateClass(MappedClass toGen) throws Exception {
		String sourcePath = toGen.getSourcePath();
		Path fullPath = Path.of(sourceDir+"/"+sourcePath);

		Files.createDirectories(fullPath.getParent());

		File sourceFile = new File(fullPath.toString());
		writeFile(sourceFile, toGen.toString());

		Logger.Log("Generated file "+toGen.getSourcePath());
	}

	// Function to write a string to a file, as well as make it if it doesn't exit
	public void writeFile(File toWrite, String content) throws IOException {
		if(!toWrite.exists()) {
			toWrite.createNewFile();
		}
		toWrite.setWritable(true);

		Files.writeString(toWrite.toPath(), content);
	}
}
