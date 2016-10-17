package com.abhijit.FirstMavenAnnotationBased;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class A5 implements Processor{

	public void cpu(){
		System.out.println("iPhone 4s Processor : A5"); 
		
	}
}
