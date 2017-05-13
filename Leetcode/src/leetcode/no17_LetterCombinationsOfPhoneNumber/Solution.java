package leetcode.no17_LetterCombinationsOfPhoneNumber;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	private static final char[][] ENCODE = {
			{ ' ' },
			{},
			{ 'a', 'b', 'c' },
			{ 'd', 'e', 'f' },
			{ 'g', 'h', 'i' },
			{ 'j', 'k', 'l' },
			{ 'm', 'n', 'o' },
			{ 'p', 'q', 'r', 's' },
			{ 't', 'u', 'v' },
			{ 'w', 'x', 'y', 'z' }
	};

	public List<String> letterCombinations(String digits) {
		List<String> list = new LinkedList<>();
		if (digits.length() > 0) {
			list.add("");
		}
		for (char digit : digits.toCharArray()) {
			List<String> newBuild = new ArrayList<>();
			for (String str : list) {
				for (char c : ENCODE[digit - '0']) {
					newBuild.add(str + c);
				}
			}
			list = newBuild;
		}
		return list;
	}
}
