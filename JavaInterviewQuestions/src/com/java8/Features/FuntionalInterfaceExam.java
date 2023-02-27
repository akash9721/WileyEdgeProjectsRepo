package com.java8.Features;

public class FuntionalInterfaceExam {
	public static void main(String[] args) {

//		Square sq = (x) -> x * x;
//		System.out.println(sq.show(5));
//
//		Predicate<String> pr = x -> x.length() > 5;
//		System.out.println(pr.test("akash kumar"));
//
//		Consumer<Integer> con = x -> System.out.println("qube is: " + (x * x * x));
//		con.accept(2);

		Square sq = new Square() {

			@Override
			public int show(int x) {
				return x * x;
			}
		};
		System.out.println(sq.show(5));

	}
}
