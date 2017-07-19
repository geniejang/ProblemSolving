package leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ListNodeTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void equalsAgainstSameValuedNodes() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(1);
		assertEquals(n2, n1);
	}

	@Test
	public void equalsAgainstDifferentValuedNodes() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		assertNotEquals(n2, n1);
	}

	@Test
	public void euqalsAgainstSameValuedNext() {
		ListNode n1 = new ListNode(1);
		n1.next = new ListNode(3);
		ListNode n2 = new ListNode(1);
		n2.next = new ListNode(3);
		assertEquals(n2, n1);
	}

	@Test
	public void euqlasAgainstDifferentValuedNext() {
		ListNode n1 = new ListNode(1);
		n1.next = new ListNode(3);
		ListNode n2 = new ListNode(1);
		n2.next = new ListNode(5);
		assertNotEquals(n2, n1);
	}

	@Test
	public void fromIntegerArray() {
		ListNode expected = new ListNode(0);
		expected.next = new ListNode(1);
		expected.next.next = new ListNode(2);
		expected.next.next.next = new ListNode(4);
		expected.next.next.next.next = new ListNode(8);
		ListNode actual = ListNode.from(new Integer[] { 0, 1, 2, 4, 8 });
		assertEquals(expected, actual);
	}

}
