package leetcode.no208_ImplementTrie;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TrieTest {

	private Trie trie;

	@Before
	public void setUp() throws Exception {
		trie = new Trie();
	}

	@After
	public void tearDown() throws Exception {
		trie = null;
	}

	@Test
	public void initiated() {
		assertNotNull(trie);
	}

	@Test
	public void noWord() {
		assertEquals(false, trie.search("a"));
		assertEquals(false, trie.startsWith("a"));
	}

	@Test
	public void hello() {
		trie.insert("hello");
		assertEquals(true, trie.search("hello"));
		assertEquals(false, trie.search("hell"));
		assertEquals(true, trie.startsWith("hell"));
	}

}
