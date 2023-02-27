package com.java.other;

//1. class should be final
final public class User {

	// 2. data member should be private and final
	private final int id;
	private final String name;
	private final Address address;

	// 3. constructor should be with all the argument
	public User(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		// return address;
		// 4. deep copy of the object
		return new Address(address.getCity(), address.getState());
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
