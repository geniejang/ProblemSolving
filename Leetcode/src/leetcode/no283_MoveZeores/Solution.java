package leetcode.no283_MoveZeores;

public class Solution {
	public void moveZeroes(int[] nums) {
		int nZero = 0;
		for (int i = 0; i < nums.length; i++) {
			while (i + nZero < nums.length && nums[i + nZero] == 0)
				nZero++;
			if (nZero > 0)
				nums[i] = i + nZero < nums.length ? nums[i + nZero] : 0;
		}
	}
}
