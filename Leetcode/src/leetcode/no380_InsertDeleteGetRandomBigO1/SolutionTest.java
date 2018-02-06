package leetcode.no380_InsertDeleteGetRandomBigO1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	RandomizedSet solution;

	@Before
	public void init() {
		solution = new RandomizedSet();
	}

	@Test
	public void example() {
		RandomizedSet randomSet = new RandomizedSet();
		assertTrue(randomSet.insert(1));
		assertFalse(randomSet.remove(2));
		assertTrue(randomSet.insert(2));
		randomSet.getRandom();
		assertTrue(randomSet.remove(1));
		assertFalse(randomSet.insert(2));
		randomSet.getRandom();
	}

	@Test
	public void insert() {
		RandomizedSet randomSet = new RandomizedSet();
		for (int i = 0; i < 41; i++) {
			randomSet.insert(i);
		}
	}

	@Test
	public void getRandomAfterRemove() {
		RandomizedSet randomSet = new RandomizedSet();
		randomSet.insert(0);
		randomSet.insert(1);
		randomSet.remove(0);
		randomSet.insert(2);
		randomSet.remove(1);
		assertEquals(2, randomSet.getRandom());
	}

	@Test
	public void negativeValue() {
		RandomizedSet randomSet = new RandomizedSet();
		randomSet.insert(0);
		randomSet.remove(0);
		randomSet.insert(-1);
		randomSet.remove(0);
		assertEquals(-1, randomSet.getRandom());
	}

	@Test
	public void removeLast() {
		RandomizedSet randomSet = new RandomizedSet();
		randomSet.insert(1);
		randomSet.insert(2);
		randomSet.remove(2);
		assertEquals(1, randomSet.getRandom());
	}

}
