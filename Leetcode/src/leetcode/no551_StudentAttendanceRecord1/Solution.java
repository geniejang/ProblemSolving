package leetcode.no551_StudentAttendanceRecord1;

public class Solution {
	public boolean checkRecord(String s) {
		int absence = 0;
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case 'A':
				absence++;
				break;
			case 'L':
				if (i < s.length() - 2 && s.charAt(i + 1) == 'L' && s.charAt(i + 2) == 'L') {
					return false;
				}
				break;
			}
		}
		return absence < 2;
	}

	public boolean checkRecordWithStream(String s) {
		return s.chars().filter(c -> c == 'A').count() < 2 && !s.contains("LLL");
	}
}
