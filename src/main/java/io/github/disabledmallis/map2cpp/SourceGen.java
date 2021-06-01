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

	public void generateClass(MappedClass toGen) throws Exception {
		String sourcePath = toGen.getSourcePath();
		Path fullPath = Path.of(sourceDir+"/"+sourcePath);

		Files.createDirectories(fullPath.getParent());

		File sourceFile = new File(fullPath.toString());
		sourceFile.createNewFile();

		sourceFile.setWritable(true);

		Files.writeString(sourceFile.toPath(), toGen.toString());

		Logger.Log("Generated file "+toGen.getSourcePath());
	}
}
