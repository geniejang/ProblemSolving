package leetcode.no38_CountAndSay;

public class Solution {
	public String countAndSay(int n) {
		String said = "1";
		while (--n > 0) {
			int count = 1;
			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < said.length(); i++) {
				char ch = said.charAt(i);
				if (i + 1 < said.length() && ch == said.charAt(i + 1)) {
					count++;
				} else {
					builder.append(count).append(ch);
					count = 1;
				}
			}
			said = builder.toString();
		}
		return said;
	}
}
