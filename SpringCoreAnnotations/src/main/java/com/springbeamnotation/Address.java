package com.springbeamnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("LUCKNOW")
	private String city;
	@Value("basti")
	private String town;

	public Address() {

	}

	@Bean
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Bean
	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", town=" + town + "]";
	}

}
