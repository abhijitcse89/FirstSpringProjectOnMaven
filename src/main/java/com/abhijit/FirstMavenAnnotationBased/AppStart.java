package com.abhijit.FirstMavenAnnotationBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppStart {

	public static void main(String[] args) {
//		Iphone iPhone = new Iphone();
//		iPhone.config();
		ApplicationContext factory = new AnnotationConfigApplicationContext(AnnotationConfig.class);
		
		Iphone fiveS = factory.getBean(Iphone.class);
		fiveS.config();
	}
}
