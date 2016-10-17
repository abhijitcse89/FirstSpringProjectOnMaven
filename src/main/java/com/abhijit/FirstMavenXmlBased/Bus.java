package com.abhijit.FirstMavenXmlBased;

import org.springframework.stereotype.Component;

@Component
public class Bus implements Vehicle{

	public void drive(){
		System.out.println("I am driving a Red Bus");
	}
}
