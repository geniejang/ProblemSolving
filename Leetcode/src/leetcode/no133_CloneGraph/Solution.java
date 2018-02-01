package leetcode.no133_CloneGraph;

import java.util.HashMap;
import java.util.Map;

import leetcode.UndirectedGraphNode;

public class Solution {
	private Map<Integer, UndirectedGraphNode> map = new HashMap<>();

	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
		map.clear();
		return node == null ? null : cloneNode(node);
	}

	private UndirectedGraphNode cloneNode(UndirectedGraphNode node) {
		if (map.containsKey(node.label)) {
			return map.get(node.label);
		}
		UndirectedGraphNode copied = new UndirectedGraphNode(node.label);
		map.put(node.label, copied);
		for (UndirectedGraphNode neighbor : node.neighbors) {
			copied.neighbors.add(cloneNode(neighbor));
		}
		return copied;
	}
}
