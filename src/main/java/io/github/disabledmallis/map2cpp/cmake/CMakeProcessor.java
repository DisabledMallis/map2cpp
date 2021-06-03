package io.github.disabledmallis.map2cpp.cmake;

import java.io.File;
import java.nio.file.Path;
import java.util.logging.FileHandler;

import io.github.disabledmallis.map2cpp.FileHelper;
import io.github.disabledmallis.map2cpp.Logger;

public class CMakeProcessor {
	
	String target;

	public CMakeProcessor(String target) {
		this.target = target;
	}

	public void createListForDir(File dir) throws Exception {
		if(dir.isDirectory()) {
			File[] files = dir.listFiles();
			
			CMakeLists list = new CMakeLists(target);
			for(File f : files) {
				if(f.isDirectory()) {
					list.addSubdirectory(f.getName());
					createListForDir(f);
				}
				if(f.isFile()) {
					list.addSource(f.getName());
					Logger.Log("Added "+f.getName()+" to CMake sources");
				}
			}
			String listCode = list.toString();
			FileHelper.writeFile(dir.getPath()+"/CMakeLists.txt", listCode);
		}
		else {
			throw new Exception("'dir' ("+dir.getPath()+") is not a directory!");
		}
	}
}
