package leetcode.no013_RomanToInteger;

public class Solution {
	public int romanToInt(String s) {
		int num = 0;
		char prev = 0;
		for (int index = 0; index < s.length(); index++) {
			char romanDigit = s.charAt(index);
			switch (romanDigit) {
			case 'I':	num++;								break;
			case 'V':	num += prev == 'I' ? 3 : 5;			break;
			case 'X':	num += prev == 'I' ? 8 : 10;		break;
			case 'L':	num += prev == 'X' ? 30 : 50;		break;
			case 'C':	num += prev == 'X' ? 80 : 100;		break;
			case 'D':	num += prev == 'C' ? 300 : 500;		break;
			case 'M':	num += prev == 'C' ? 800 : 1000;	break;
			default:
				throw new IllegalArgumentException();
			}
			prev = romanDigit;
		}

		return num;
	}
}
