package euler.no013_LargeSum;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static String solve(String[] nums) {
		Stack<Integer> stack = new Stack<>();
		int carry = 0;
		for (int i = 49; i >= 0; i--) {
			int sum = carry;
			for (String num : nums) {
				sum += num.charAt(i) - '0';
			}
			stack.push(sum % 10);
			carry = sum / 10;
		}
		StringBuilder sb = new StringBuilder(10);
		sb.append(carry);
		for (int i = sb.length(); i < 10; i++) {
			sb.append(stack.pop());
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		String[] nums = new String[t];
		for (int a0 = 0; a0 < t; a0++) {
			nums[a0] = in.next();
		}
		System.out.println(solve(nums));
		in.close();
	}
}
