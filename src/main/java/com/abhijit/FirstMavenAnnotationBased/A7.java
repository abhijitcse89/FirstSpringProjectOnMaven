package com.abhijit.FirstMavenAnnotationBased;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class A7 implements Processor{

	public void cpu(){
		System.out.println("iPhone 5s Processor : A7"); 
		
	}
}
