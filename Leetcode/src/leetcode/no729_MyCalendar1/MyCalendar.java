package leetcode.no729_MyCalendar1;

import java.util.ArrayList;
import java.util.List;

public class MyCalendar {
	List<Integer> list;

	public MyCalendar() {
		list = new ArrayList<>();
	}

	public boolean book(int start, int end) {
		for (int i = 0; i < list.size() - 1; i += 2) {
			if (list.get(i) < end && list.get(i + 1) > start) {
				return false;
			}
		}
		list.add(start);
		list.add(end);
		return true;
	}
}
