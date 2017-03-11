package leetcode.no393_UTF8Validation;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	private Solution solution;

	@Before
	public void setUp() throws Exception {
		solution = new Solution();
	}

	@Test
	public void initiated() {
		assertNotNull(solution);
	}

	@Test
	public void singleByteValid() {
		int[] data = { 0x7F };
		assertTrue(solution.validUtf8(data));
	}

	@Test
	public void singleByteInvalid() {
		int[] data = { 0x80 };
		assertFalse(solution.validUtf8(data));
	}

	@Test
	public void twoBytesValid() {
		int[] data = { 0xC0, 0x80 };
		assertTrue(solution.validUtf8(data));
	}

	@Test
	public void multiBytesInvalid_FirstTooSmall() {
		int[] data = { 0x80, 0x80 };
		assertFalse(solution.validUtf8(data));
	}

	@Test
	public void multiBytesInvalid_FirstTooBig() {
		int[] data = { 0xE0, 0x80 };
		assertFalse(solution.validUtf8(data));
	}

	@Test
	public void twoBytesInvalid_TooSmall() {
		int[] data = { 0xC0, 0x70 };
		assertFalse(solution.validUtf8(data));
	}

	@Test
	public void twoBytesInvalid_TooBig() {
		int[] data = { 0xC0, 0xC0 };
		assertFalse(solution.validUtf8(data));
	}

	@Test
	public void threeBytesValid() {
		int[] data = { 0xE0, 0x80, 0x80 };
		assertTrue(solution.validUtf8(data));
	}

	@Test
	public void threeBytesInvalid_TooSmall() {
		int[] data = { 0xE0, 0x80, 0x70 };
		assertFalse(solution.validUtf8(data));
	}

	@Test
	public void threeBytesInvalid_TooBig() {
		int[] data = { 0xE0, 0x80, 0xC0 };
		assertFalse(solution.validUtf8(data));
	}

	@Test
	public void fourBytesValid() {
		int[] data = { 0xF0, 0x80, 0x80, 0x80 };
		assertTrue(solution.validUtf8(data));
	}

	@Test
	public void fourBytesInvalid_TooSmall() {
		int[] data = { 0xF0, 0x80, 0x80, 0x70 };
		assertFalse(solution.validUtf8(data));
	}

	@Test
	public void fourBytesInvalid_TooBig() {
		int[] data = { 0xF0, 0x80, 0x80, 0xC0 };
		assertFalse(solution.validUtf8(data));
	}

}
