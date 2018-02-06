package leetcode.no380_InsertDeleteGetRandomBigO1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

class RandomizedSet {
	private Map<Integer, Integer> map;
	private List<Integer> list;
	private Random rand = new Random();

	/** Initialize your data structure here. */
	public RandomizedSet() {
		map = new HashMap<>(10);
		list = new ArrayList<>();
	}

	/**
	 * Inserts a value to the set. Returns true if the set did not already contain
	 * the specified element.
	 */
	public boolean insert(int val) {
		if (map.containsKey(val)) {
			return false;
		}
		map.put(val, list.size());
		list.add(val);
		return true;
	}

	/**
	 * Removes a value from the set. Returns true if the set contained the specified
	 * element.
	 */
	public boolean remove(int val) {
		if (!map.containsKey(val)) {
			return false;
		}
		int idx = map.remove(val);
		if (idx < list.size() - 1) {
			int mov = list.get(list.size() - 1);
			list.set(idx, mov);
			map.put(mov, idx);
		}
		list.remove(list.size() - 1);
		return true;
	}

	/** Get a random element from the set. */
	public int getRandom() {
		return list.get(rand.nextInt(list.size()));
	}
}
