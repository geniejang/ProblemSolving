package leetcode.no609_FindDuplicateFileInSystem;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
	public List<List<String>> findDuplicate(String[] paths) {
		Map<String, List<String>> map = new HashMap<>();
		for (String dir : paths) {
			String[] info = dir.split(" ");
			for (int i = 1; i < info.length; i++) {
				int pos = info[i].indexOf('(');
				String fileName = info[i].substring(0, pos);
				String content = info[i].substring(pos, info[i].length() - 1);
				List<String> files = map.get(content);
				if (files == null) {
					files = new LinkedList<>();
					map.put(content, files);
				}
				files.add(info[0] + '/' + fileName);
			}
		}
		List<List<String>> dups = new LinkedList<>();
		for (List<String> files : map.values()) {
			if (files.size() > 1) {
				dups.add(files);
			}
		}
		return dups;
	}
}
