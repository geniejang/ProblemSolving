package leetcode.no384_ShuffleAnArray;

import static org.junit.Assert.*;
import static org.junit.Assume.*;

import java.util.Arrays;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void shuffle() {
		int[] nums = { 1, 2, 3 };
		Solution solution = new Solution(nums);
		int[] copied = Arrays.copyOf(nums, nums.length);

		int[] shuffled = solution.shuffle();
		assertEquals(copied.length, shuffled.length);
		int sameCount = 0;
		for (int i = 0; i < shuffled.length; i++) {
			if (shuffled[i] == copied[i])
				sameCount++;
		}
		assumeTrue(sameCount < shuffled.length);

		Arrays.sort(copied);
		Arrays.sort(shuffled);
		assertArrayEquals(copied, shuffled);
	}

	@Test
	public void reset() {
		int[] nums = { 1, 2, 3 };
		Solution solution = new Solution(nums);
		int[] copied = Arrays.copyOf(nums, nums.length);

		solution.shuffle();
		int[] resetted = solution.reset();
		assertArrayEquals(copied, resetted);
	}
}
