package leetcode.no492_ConstructRectangle;

public class Solution {
	public int[] constructRectangle(int area) {
		int divider = (int) Math.sqrt(area);
		while (divider > 0) {
			if (area % divider == 0)
				break;
			divider--;
		}

		return new int[] { area / divider, divider };
	}
}
