package io.github.disabledmallis.map2cpp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import net.fabricmc.mapping.reader.v2.MappingGetter;
import net.fabricmc.mapping.reader.v2.TinyVisitor;
import net.fabricmc.mapping.tree.TinyMappingFactory;
import net.fabricmc.mapping.tree.TinyTree;

public class Main {

	//static ArrayList<MappedClass> classes = new ArrayList<>();

	static String intermediaryPath = "mappings/intermediary.tiny";
	static String mappingPath = "mappings/named.tiny";
    public static void main(String[] args) throws IOException {
		for(int i = 0; i < args.length; i++) {
			String current = args[i];
			if(current.equals("-i") || current.equals("--intermediary")) {
				intermediaryPath = args[i+1];
			}
			if(current.equals("-m") || current.equals("--mapped")) {
				mappingPath = args[i+1];
			}
		}
		
		BufferedReader intermediaryReader = new BufferedReader(new FileReader(intermediaryPath));
		TinyTree intermediaryTree = TinyMappingFactory.loadLegacy(intermediaryReader);

		BufferedReader mappingReader = new BufferedReader(new FileReader(mappingPath));
		TinyTree mappingTree = TinyMappingFactory.loadLegacy(mappingReader);

		MappingReader mapReader = new MappingReader(intermediaryTree, mappingTree);

		MappedClass[] classes = mapReader.generateClasses();
		for(MappedClass mClass : classes) {
			Logger.Log("SOURCE: "+mClass.getSourcePath());
			Logger.Log(mClass.toString());
		}
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
