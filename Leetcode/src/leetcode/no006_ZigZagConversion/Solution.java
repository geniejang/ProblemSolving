package leetcode.no006_ZigZagConversion;

public class Solution {
	public String convert(String s, int numRows) {
		if (numRows == 1)
			return s;

		StringBuffer buffer = new StringBuffer(s.length());
		buffer.setLength(s.length());
		int mv1 = (numRows - 1) * 2;
		int mv2 = 0;
		int index = 0;
		int row = 0;
		for (int i = 0; i < s.length();) {
			if (mv1 > 0) {
				buffer.setCharAt(i++, s.charAt(index));
				index += mv1;
				if (index >= s.length()) {
					index = ++row;
					mv1 -= 2;
					mv2 += 2;
					continue;
				}
			}
			if (mv2 > 0) {
				buffer.setCharAt(i++, s.charAt(index));
				index += mv2;
				if (index >= s.length()) {
					index = ++row;
					mv1 -= 2;
					mv2 += 2;
				}
			}
		}

		return buffer.toString();
	}
}
