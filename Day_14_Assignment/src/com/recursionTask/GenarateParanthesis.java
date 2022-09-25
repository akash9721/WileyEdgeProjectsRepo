package com.recursionTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenarateParanthesis {

	private static void solve(List<String> res, String str, int open, int close) {
		if (open == 0 && close == 0) {
			res.add(str);
			return;
		}
		if (open > 0) {
			solve(res, str + "(", open - 1, close);
		}
		if (close > open) {
			solve(res, str + ")", open, close - 1);
		}

	}

	private static List<String> genarateParanthesis(int n) {
		List<String> res = new ArrayList<String>();
		solve(res, "", n, n);
		return res;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no:");
		int n = sc.nextInt();
		List<String> str = genarateParanthesis(n);
		System.out.println(str);

	}

}
