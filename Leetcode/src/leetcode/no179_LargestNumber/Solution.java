package leetcode.no179_LargestNumber;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public String largestNumber(int[] nums) {
		List<String> list = new ArrayList<>(nums.length);
		for (int num : nums) {
			list.add(String.valueOf(num));
		}
		list.sort((a, b) -> {
			int alen = a.length();
			char[] concat = (a + b + a).toCharArray();
			for (int i = alen; i < concat.length; i++) {
				char ad = concat[i - alen];
				char bd = concat[i];
				if (bd != ad) {
					return bd - ad;
				}
			}
			return 0;
		});
		StringBuilder sb = new StringBuilder();
		for (String num : list) {
			sb.append(num);
		}
		return sb.charAt(0) == '0' ? "0" : sb.toString();
	}
}
