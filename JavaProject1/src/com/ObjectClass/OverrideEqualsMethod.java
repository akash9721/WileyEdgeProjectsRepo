package com.ObjectClass;

class Employee implements Cloneable {
	private String name;
	private int id;

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj; // downcaste
		if (this.name == e.name)
			return true;
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id * 2;
	}

}

public class OverrideEqualsMethod {

	public static void main(String[] args) {
		Employee e1 = new Employee("Hello", 123);
		Employee e2 = new Employee("Hello", 123);

		if (e1.equals(e2))
			System.out.println("object are equals");
		else {
			System.out.println("object are not equals");
		}

		System.out.println("------------------------------");
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());

	}

}
