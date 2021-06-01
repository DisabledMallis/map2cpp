package io.github.disabledmallis.map2cpp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import net.fabricmc.mapping.reader.v2.MappingGetter;
import net.fabricmc.mapping.reader.v2.TinyVisitor;
import net.fabricmc.mapping.tree.TinyMappingFactory;
import net.fabricmc.mapping.tree.TinyTree;

public class Main {
	//Paths to mapping files, intermediary and named
	static String intermediaryPath = "mappings/intermediary.tiny";
	static String mappingPath = "mappings/named.tiny";
	static String targetMapping = "official";
	static String outputDir = "generated/src/";

    public static void main(String[] args) throws IOException {
		// Read arguments
		for(int i = 0; i < args.length; i++) {
			String current = args[i];
			if(current.equals("-h") || current.equals("--help")) {
				Logger.Log("Help Menu:");
				Logger.Log("-i --intermediary | The intermediary mappings file.");
				Logger.Log("-m --mapped | The named mappings file.");
				Logger.Log("-t --target | The target mapping type (named, intermediary, official | for Forge, Fabric and most other mod loaders target intermediary. Official for vanilla client.)");
				Logger.Log("-o --output | The directory to output the generated source files.");
				return;
			}
			if(current.equals("-i") || current.equals("--intermediary")) {
				intermediaryPath = args[i+1];
			}
			if(current.equals("-m") || current.equals("--mapped")) {
				mappingPath = args[i+1];
			}
			if(current.equals("-t") || current.equals("--target")) {
				targetMapping = args[i+1];
			}
			if(current.equals("-o") || current.equals("--output")) {
				outputDir = args[i+1];
			}
		}

		//
		// Open and parse the trees
		//
		BufferedReader intermediaryReader = new BufferedReader(new FileReader(intermediaryPath));
		TinyTree intermediaryTree = TinyMappingFactory.loadLegacy(intermediaryReader);

		BufferedReader mappingReader = new BufferedReader(new FileReader(mappingPath));
		TinyTree mappingTree = TinyMappingFactory.loadLegacy(mappingReader);

		// Read the trees
		MappingReader mapReader = new MappingReader(intermediaryTree, mappingTree);

		// Generate the classes
		MappedClass[] classes = mapReader.generateClasses();

		// Generate sources
		SourceGen sourceGen = new SourceGen(outputDir);
		for(MappedClass mClass : classes) {
			try {
				sourceGen.generateClass(mClass);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		//Loop through
		/*for(MappedClass mClass : classes) {
			//Print them out
			Logger.Log("SOURCE: "+mClass.getSourcePath());
			Logger.Log(mClass.toString());
		}*/
    }

	public static class Visitor implements TinyVisitor {
		/**
		 * Visit a class.
		 *
		 * <p>{@link #start(TinyMetadata)} is called before this call and the visit stack
		 * is empty.
		 *
		 * @param name the mappings
		 */
		public void pushClass(MappingGetter name) {
			Logger.Log(name.getAllNames()[0]);
		}
	}
}
