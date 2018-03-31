package leetcode.no391_PerfectRectangle;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public boolean isRectangleCover(int[][] rectangles) {
		Set<Long> pts = new HashSet<>();
		int xl = Integer.MAX_VALUE;
		int yb = Integer.MAX_VALUE;
		int xr = Integer.MIN_VALUE;
		int yt = Integer.MIN_VALUE;
		long area = 0;
		for (int[] rect : rectangles) {
			xl = Integer.min(xl, rect[0]);
			yb = Integer.min(yb, rect[1]);
			xr = Integer.max(xr, rect[2]);
			yt = Integer.max(yt, rect[3]);
			area += ((long) rect[2] - rect[0]) * ((long) rect[3] - rect[1]);
			updatePoints(pts, rect[0], rect[1]);
			updatePoints(pts, rect[2], rect[3]);
			updatePoints(pts, rect[0], rect[3]);
			updatePoints(pts, rect[2], rect[1]);
		}
		return pts.size() == 4 && pts.contains(pt(xl, yb)) && pts.contains(pt(xr, yt)) && pts.contains(pt(xl, yt))
				&& pts.contains(pt(xr, yb)) && area == ((long) xr - xl) * ((long) yt - yb);
	}

	private long pt(long x, int y) {
		return (x << 32) | (0xffffffffL & y);
	}

	private void updatePoints(Set<Long> pts, int x, int y) {
		long pt = pt(x, y);
		if (!pts.add(pt)) {
			pts.remove(pt);
		}
	}
}
