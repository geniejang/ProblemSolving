package leetcode.no735_AsteroidCollision;

import java.util.Arrays;

public class Solution {
	public int[] asteroidCollision(int[] asteroids) {
		int[] survived = new int[asteroids.length];
		int count = 0;
		int i = 0;
		while (i < asteroids.length) {
			if (count == 0 || survived[count - 1] < 0 || asteroids[i] > 0) {
				survived[count++] = asteroids[i++];
			} else {
				int sum = survived[count - 1] + asteroids[i];
				if (sum >= 0) {
					i++;
				}
				if (sum <= 0) {
					count--;
				}
			}
		}
		return Arrays.copyOf(survived, count);
	}
}
