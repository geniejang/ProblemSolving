package leetcode.no721_AccountsMerge;

import static org.junit.Assert.*;

import java.util.List;

import org.hamcrest.collection.IsIterableContainingInAnyOrder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	private SolutionDFS solution;

	@Before
	public void setUp() throws Exception {
		solution = new SolutionDFS();
	}

	@After
	public void tearDown() throws Exception {
		solution = null;
	}

	@Test
	public void initiated() {
		assertNotNull(solution);
	}

	private void assertMerge(List<List<String>> expected, List<List<String>> accounts) {
		List<List<String>> actual = solution.accountsMerge(accounts);
		assertThat(actual, IsIterableContainingInAnyOrder.containsInAnyOrder(expected.toArray()));
	}

	@Test
	public void example1() {
		List<List<String>> accounts = List.of(
				List.of("John", "johnsmith@mail.com", "john00@mail.com"),
				List.of("John", "johnnybravo@mail.com"),
				List.of("John", "johnsmith@mail.com", "john_newyork@mail.com"),
				List.of("Mary", "mary@mail.com"));
		List<List<String>> expected = List.of(
				List.of("John", "john00@mail.com", "john_newyork@mail.com", "johnsmith@mail.com"),
				List.of("John", "johnnybravo@mail.com"),
				List.of("Mary", "mary@mail.com"));
		assertMerge(expected, accounts);
	}

	@Test
	public void example2() {
		List<List<String>> accounts = List.of(List.of("David", "David0@m.co", "David1@m.co"),
				List.of("David", "David3@m.co", "David4@m.co"), List.of("David", "David4@m.co", "David5@m.co"),
				List.of("David", "David2@m.co", "David3@m.co"), List.of("David", "David1@m.co", "David2@m.co"));
		List<List<String>> expected = List.of(List.of("David", "David0@m.co", "David1@m.co", "David2@m.co",
				"David3@m.co", "David4@m.co", "David5@m.co"));
		assertMerge(expected, accounts);
	}

	@Test
	public void example3() {
		List<List<String>> accounts = List.of(List.of("Hanzo", "Hanzo2@m.co", "Hanzo3@m.co"),
				List.of("Hanzo", "Hanzo4@m.co", "Hanzo5@m.co"), List.of("Hanzo", "Hanzo0@m.co", "Hanzo1@m.co"),
				List.of("Hanzo", "Hanzo3@m.co", "Hanzo4@m.co"), List.of("Hanzo", "Hanzo7@m.co", "Hanzo8@m.co"),
				List.of("Hanzo", "Hanzo1@m.co", "Hanzo2@m.co"), List.of("Hanzo", "Hanzo6@m.co", "Hanzo7@m.co"),
				List.of("Hanzo", "Hanzo5@m.co", "Hanzo6@m.co"));
		List<List<String>> expected = List.of(List.of("Hanzo", "Hanzo0@m.co", "Hanzo1@m.co", "Hanzo2@m.co",
				"Hanzo3@m.co", "Hanzo4@m.co", "Hanzo5@m.co", "Hanzo6@m.co", "Hanzo7@m.co", "Hanzo8@m.co"));
		assertMerge(expected, accounts);
	}

}
