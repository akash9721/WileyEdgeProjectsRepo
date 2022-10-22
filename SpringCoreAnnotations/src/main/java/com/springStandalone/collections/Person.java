package com.springStandalone.collections;

import java.util.List;
import java.util.Map;

public class Person {
	private List<String> friends;
	private Map<String, Integer> courseplan;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Map<String, Integer> getCourseplan() {
		return courseplan;
	}

	public void setCourseplan(Map<String, Integer> courseplan) {
		this.courseplan = courseplan;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", courseplan=" + courseplan + "]";
	}

}
