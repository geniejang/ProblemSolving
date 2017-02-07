package leetcode.no501_FindModeInBST;

import java.util.Arrays;

import leetcode.TreeNode;

public class Solution {
	private int currVal;
	private int currCnt;
	private int maxCnt;

	private int freqIdx;
	private int[] freqs = new int[5];

	public int[] findMode(TreeNode root) {
		traverseInorder(root);
		handleCount();
		return Arrays.copyOf(freqs, freqIdx);
	}

	private void traverseInorder(TreeNode node) {
		if (node == null)
			return;

		traverseInorder(node.left);
		if (currVal == node.val) {
			currCnt++;
		} else {
			handleCount();
			currVal = node.val;
			currCnt = 1;
		}
		traverseInorder(node.right);
	}

	private void handleCount() {
		if (currCnt == maxCnt && maxCnt > 0) {
			freqs[freqIdx++] = currVal;
			if (freqIdx == freqs.length) {
				freqs = Arrays.copyOf(freqs, freqs.length * 2);
			}
		} else if (currCnt > maxCnt) {
			maxCnt = currCnt;
			freqIdx = 0;
			freqs[freqIdx++] = currVal;
		}
	}
}
