package io.github.disabledmallis.map2cpp;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;

import java.net.URL;
import java.net.URLConnection;

import io.github.disabledmallis.map2cpp.mapping.MappedClass;

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

	public void genJniSources(String path) throws Exception {
		/* JNI.h source */
		URL jnih_url = new URL("https://github.com/openjdk/jdk/raw/master/src/java.base/share/native/include/jni.h");

		StringBuilder jnih = new StringBuilder();
		BufferedReader jnih_reader = new BufferedReader(new InputStreamReader(jnih_url.openStream(), "UTF-8"));
		for (String line; (line = jnih_reader.readLine()) != null;) {
			jnih.append(line+"\n");
		}

		// Write jni.h
		FileHelper.writeFile(path+"/jni.h", jnih.toString());


		/* JNI_md.h source */
		URL jnimdh_url = new URL("https://github.com/openjdk/jdk/raw/master/src/java.base/windows/native/include/jni_md.h");

		StringBuilder jnimdh = new StringBuilder();
		BufferedReader jnimdh_reader = new BufferedReader(new InputStreamReader(jnimdh_url.openStream(), "UTF-8"));
		for (String line; (line = jnimdh_reader.readLine()) != null;) {
			jnimdh.append(line+"\n");
		}

		// Write jni_md.h
		FileHelper.writeFile(path+"/jni_md.h", jnimdh.toString());
	}


	// Generate the class file for a MappedClass
	public void generateClass(MappedClass toGen) throws Exception {
		String sourcePath = toGen.getSourcePath();
		Path fullPath = Path.of(sourceDir+"/"+sourcePath);

		Files.createDirectories(fullPath.getParent());

		File sourceFile = new File(fullPath.toString());
		FileHelper.writeFile(sourceFile, toGen.toString());

		Logger.Log("Generated file "+toGen.getSourcePath());
	}
}
