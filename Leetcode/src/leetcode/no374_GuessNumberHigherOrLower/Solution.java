package leetcode.no374_GuessNumberHigherOrLower;

public class Solution extends GuessGame {
	public int guessNumber(int n) {
		int small = 1;
		int big = n;

		int target = 0;
		int result = 1;
		while (result != 0) {
			if (result > 0)
				small = target + 1;
			else
				big = target - 1;
			target = small + (big - small) / 2;
			result = guess(target);
		}

		return target;
	}

}
