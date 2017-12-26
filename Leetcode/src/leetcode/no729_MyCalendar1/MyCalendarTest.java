package leetcode.no729_MyCalendar1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyCalendarTest {

	private MyCalendar calendar;

	@Before
	public void setUp() throws Exception {
		calendar = new MyCalendar();
	}

	@After
	public void tearDown() throws Exception {
		calendar = null;
	}

	@Test
	public void initiated() {
		assertNotNull(calendar);
	}

	@Test
	public void given() {
		int[][] periods = { { 47, 50 }, { 33, 41 }, { 39, 45 }, { 33, 42 }, { 25, 32 }, { 26, 35 }, { 19, 25 },
				{ 3, 8 }, { 8, 13 }, { 18, 27 } };
		boolean[] expecteds = { true, true, false, false, true, false, true, true, true, false };
		for (int i = 0; i < periods.length; i++) {
			assertEquals("[" + i + "]", expecteds[i], calendar.book(periods[i][0], periods[i][1]));
		}
	}

}
