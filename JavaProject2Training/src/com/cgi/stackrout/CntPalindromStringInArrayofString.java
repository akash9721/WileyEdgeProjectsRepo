package com.cgi.stackrout;

class Newis {

	public int cntpalin(String[] arr, int n) {
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if (ispalin(arr[i]))
				cnt++;
		}
		return cnt;
	}

	public boolean ispalin(String str) {
		String revstr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revstr += str.charAt(i);
		}
		if (str.equals(revstr))
			return true;
		else {
			return false;
		}
	}
}

public class CntPalindromStringInArrayofString {
	public static void main(String[] args) {
		String[] arr = { "civic", "tenet", "akash", "kayak" };
		int n = arr.length;
		Newis obj = new Newis();
		int x = obj.cntpalin(arr, n);
		System.out.println(x);
	}

}
