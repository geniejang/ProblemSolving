package leetcode.no760_FindAnagramMappings;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int[] anagramMappings(int[] A, int[] B) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < B.length; i++) {
			map.put(B[i], i);
		}
		int[] arr = new int[A.length];
		for (int i = 0; i < B.length; i++) {
			arr[i] = map.get(A[i]);
		}
		return arr;
	}
}
