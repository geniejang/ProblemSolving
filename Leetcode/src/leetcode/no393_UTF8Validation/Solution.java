package leetcode.no393_UTF8Validation;

public class Solution {
	public boolean validUtf8(int[] data) {
		for (int i = 0; i < data.length; i++) {
			if ((data[i] & 0x80) == 0) {
				continue;
			}
			int followed = (data[i] & 0xE0) == 0xC0 ? 1
						 : (data[i] & 0xF0) == 0xE0 ? 2
						 : (data[i] & 0xF8) == 0xF0 ? 3
						 : -1;
			if (followed == -1) {
				return false;
			}
			while (followed-- > 0) {
				if (++i == data.length || (data[i] >> 6) != 2) {
					return false;
				}
			}
		}
		return true;
	}
}
