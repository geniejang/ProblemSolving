package leetcode;

public class Interval {
	public int start;
	public int end;

	public Interval() {
		start = 0;
		end = 0;
	}

	public Interval(int s, int e) {
		start = s;
		end = e;
	}

	public static Interval[] from(int[][] arr) {
		if (arr == null || arr.length == 0) {
			return null;
		}
		Interval[] intervals = new Interval[arr.length];
		for (int i = 0; i < arr.length; i++) {
			intervals[i] = new Interval(arr[i][0], arr[i][1]);
		}
		return intervals;
	}

	@Override
	public boolean equals(Object obj) {
		if (false == obj instanceof Interval) {
			return false;
		}
		Interval interval = (Interval) obj;
		return start == interval.start && end == interval.end;
	}

	@Override
	public String toString() {
		return "[" + start + ", " + end + "]";
	}
}
