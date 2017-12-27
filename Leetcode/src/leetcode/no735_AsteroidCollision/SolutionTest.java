package leetcode.no735_AsteroidCollision;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	private Solution solution;

	@Before
	public void setUp() throws Exception {
		solution = new Solution();
	}

	@After
	public void tearDown() throws Exception {
		solution = null;
	}

	@Test
	public void initiated() {
		assertNotNull(solution);
	}

	private void assertAsteroids(int[] expecteds, int[] asteroids) {
		int[] actuals = solution.asteroidCollision(asteroids);
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void plusOnly() {
		int[] asteroids = { 5, 10 };
		int[] expecteds = { 5, 10 };
		assertAsteroids(expecteds, asteroids);
	}

	@Test
	public void minusOnly() {
		int[] asteroids = { -3, -1 };
		int[] expecteds = { -3, -1 };
		assertAsteroids(expecteds, asteroids);
	}

	@Test
	public void minusPlus() {
		int[] asteroids = { -3, 1 };
		int[] expecteds = { -3, 1 };
		assertAsteroids(expecteds, asteroids);
	}

	@Test
	public void plusWins() {
		int[] asteroids = { 3, -1 };
		int[] expecteds = { 3 };
		assertAsteroids(expecteds, asteroids);
	}

	@Test
	public void minusWins() {
		int[] asteroids = { 3, -10 };
		int[] expecteds = { -10 };
		assertAsteroids(expecteds, asteroids);
	}

	@Test
	public void doubleKnockDown() {
		int[] asteroids = { 2, -2 };
		int[] expecteds = {};
		assertAsteroids(expecteds, asteroids);
	}

	@Test
	public void example1() {
		int[] asteroids = { 5, 10, -5 };
		int[] expecteds = { 5, 10 };
		assertAsteroids(expecteds, asteroids);
	}

	@Test
	public void example2() {
		int[] asteroids = { 8, -8 };
		int[] expecteds = {};
		assertAsteroids(expecteds, asteroids);
	}

	@Test
	public void example3() {
		int[] asteroids = { 10, 2, -5 };
		int[] expecteds = { 10 };
		assertAsteroids(expecteds, asteroids);
	}

	@Test
	public void example4() {
		int[] asteroids = { -2, -1, 1, 2 };
		int[] expecteds = { -2, -1, 1, 2 };
		assertAsteroids(expecteds, asteroids);
	}

}
