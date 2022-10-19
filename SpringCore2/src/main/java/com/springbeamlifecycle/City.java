package com.springbeamlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class City implements InitializingBean, DisposableBean {
	private String name;

	public City() {
		// TODO Auto-generated constructor stub
	}

	public City(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "City [name=" + name + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// obj creatin
		System.out.println("init part");

	}

	public void destroy() throws Exception {
		// obj destroyed
		System.out.println("obj distroyed");

	}

}
