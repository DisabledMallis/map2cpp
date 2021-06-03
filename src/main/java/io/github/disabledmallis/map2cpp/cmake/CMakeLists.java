package io.github.disabledmallis.map2cpp.cmake;

import java.util.ArrayList;

public class CMakeLists {

	String target;
	ArrayList<String> subDirs;
	ArrayList<String> sources;

	public CMakeLists(String target) {
		this.target = target;
		subDirs = new ArrayList<>();
		sources = new ArrayList<>();
	}

	public void addSubdirectory(String subDir) {
		subDirs.add(subDir);
	}

	public void addSource(String soruce) {
		sources.add(soruce);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		for (String dir : subDirs) {
			builder.append("add_subdirectory(");
			builder.append(dir);
			builder.append(")\n");
		}
		if(sources.size() == 0) {
			return builder.toString();
		}
		builder.append("target_sources(");
		builder.append(target);
		builder.append(" PRIVATE \n");
		for (String source : sources) {
			builder.append("\"");
			builder.append(source);
			builder.append("\"\n");
		}
		builder.append(")\n");

		return builder.toString();
	}
}
