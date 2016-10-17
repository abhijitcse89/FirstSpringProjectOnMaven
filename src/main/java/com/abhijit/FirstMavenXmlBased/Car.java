package com.abhijit.FirstMavenXmlBased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	@Autowired
	private Wheel wheel;

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public void drive(){
		System.out.println("I am driving Honda City"+" which runs on "+wheel);
	}
}
