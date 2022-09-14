package com.cgi.stackrout;

public class CntNoOfOddWords {
	public boolean oddlen(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			count++;
		}
		if (count % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	public int findlength(String[] arr, int n) {
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if (oddlen(arr[i]))
				cnt++;
		}
		return cnt;
	}

	public static void main(String[] args) {
		String[] arr = { "level", "is", "madam" };
		int n = arr.length;
		CntNoOfOddWords c = new CntNoOfOddWords();
		int x = c.findlength(arr, n);
		System.out.println(x);
	}

}
