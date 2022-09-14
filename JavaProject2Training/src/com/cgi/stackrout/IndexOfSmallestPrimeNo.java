package com.cgi.stackrout;

public class IndexOfSmallestPrimeNo {
	public boolean isprime(int x, int n) {
		if (x <= 1)
			return false;
		else if (n == 2)
			return true;
		else if (n % 2 == 0) {
			return false;
		}
		for (int i = 3; i * i <= n; i++) {
			if (x % i == 0)
				return false;
		}
		return true;
	}

	public int findindex(int a[], int n) {
		int min = Integer.MAX_VALUE;
		int ind = -2;
		if (n == 0)
			return -1;
		for (int i = 0; i < n; i++) {
			if (isprime(a[i], n)) {
				if (a[i] < min) {

					min = a[i];
					ind = i;
				}
			}
		}
		return ind;
	}

	public static void main(String[] args) {
		int a[] = { -12, 5, 56, 2, -24, 67, 11 };
		IndexOfSmallestPrimeNo in = new IndexOfSmallestPrimeNo();
		int n = a.length;
		int x = in.findindex(a, n);
		System.out.println(x);
	}

}
