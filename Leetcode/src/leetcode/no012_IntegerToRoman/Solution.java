package leetcode.no012_IntegerToRoman;

public class Solution {
	private static final String[] UNITS = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
	private static final String[] TENS = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
	private static final String[] HUNDREDS = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
	private static final String[] THOUSANDS = { "", "M", "MM", "MMM" };
 
	public String intToRoman(int num) {
		return THOUSANDS[num / 1000] + HUNDREDS[(num / 100) % 10] + TENS[(num / 10) % 10] + UNITS[num % 10];
	}
}
