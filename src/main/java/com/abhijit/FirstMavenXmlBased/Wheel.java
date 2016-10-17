package com.abhijit.FirstMavenXmlBased;

import org.springframework.stereotype.Component;

@Component
public class Wheel {
	private String brand;

//	private Wheel(String brand){
//		super();
//		this.brand=brand;
//	}
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String toString() {
		return "Tyre [brand=" + brand + "]";
	}
}
