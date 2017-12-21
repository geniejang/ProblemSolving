package leetcode.no232_ImplementQueueUsingStacks;

import java.util.Stack;

class MyQueue {

	Stack<Integer> front;
	Stack<Integer> end;

	/** Initialize your data structure here. */
	public MyQueue() {
		front = new Stack<>();
		end = new Stack<>();
	}

	/** Push element x to the back of queue. */
	public void push(int x) {
		front.push(x);
	}

	private void moveOnEmptyEnd() {
		if (end.empty()) {
			while (!front.empty()) {
				end.push(front.pop());
			}
		}
	}

	/** Removes the element from in front of queue and returns that element. */
	public int pop() {
		moveOnEmptyEnd();
		return end.pop();
	}

	/** Get the front element. */
	public int peek() {
		moveOnEmptyEnd();
		return end.peek();
	}

	/** Returns whether the queue is empty. */
	public boolean empty() {
		return end.empty() && front.empty();
	}
}

/**
 * Your MyQueue object will be instantiated and called as such: MyQueue obj =
 * new MyQueue(); obj.push(x); int param_2 = obj.pop(); int param_3 =
 * obj.peek(); boolean param_4 = obj.empty();
 */