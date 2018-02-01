package leetcode;

import java.util.ArrayList;
//import java.util.Comparator;
import java.util.List;

public class UndirectedGraphNode {
	public int label;
	public List<UndirectedGraphNode> neighbors;

	public UndirectedGraphNode(int x) {
		label = x;
		neighbors = new ArrayList<UndirectedGraphNode>();
	}

	// TODO: Implement methods below

//	public static UndirectedGraphNode from(String serialized) {
//		if (serialized == null || serialized.length() == 0) {
//			return null;
//		}
//		String[] links = serialized.split("#");
//		return from(arr, 0);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (false == obj instanceof UndirectedGraphNode) {
//			return false;
//		}
//		UndirectedGraphNode node = (UndirectedGraphNode) obj;
//		if (label != node.label)
//			return false;
//
//		return true;
//	}

	@Override
	public String toString() {
		return "[" + label + "]";
	}

//	public static Comparator<UndirectedGraphNode> COMPARATOR = new Comparator<UndirectedGraphNode>() {
//		@Override
//		public int compare(UndirectedGraphNode o1, UndirectedGraphNode o2) {
//			if (o1 == null && o2 == null)
//				return 0;
//			if (o1 == null)
//				return 1;
//			if (o2 == null)
//				return -1;
//			int diff = o1.label - o2.label;
//			return diff;
//		}
//	};
}
