package com.ObjectClass;

class ABC implements Cloneable {
	int i = 10;
	int j = 20;

	@Override
	public String toString() {
		return "ABC [i=" + i + ", j=" + j + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}

public class CloneDemo1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		ABC obj = new ABC();
		ABC obj2 = (ABC) obj.clone();
		obj2.j = 9999;
		System.out.println(obj);
		System.out.println(obj2);
	}

}

//if cloning is shallow copying then it give the same value 10 9999 and 10 9999
// it is giving diff values means cloning look like shalow copying but
// internally work as deep copying
