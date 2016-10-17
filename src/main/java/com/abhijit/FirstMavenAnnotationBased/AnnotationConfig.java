package com.abhijit.FirstMavenAnnotationBased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.abhijit.FirstMavenAnnotationBased")
public class AnnotationConfig {
//	@Bean
//	public Iphone getPhone(){
//		return new Iphone();
//	}
//	
//	@Bean
//	public Processor get5sProcessor(){
//		return new A7();
//	}
//	@Bean
//	public Processor get4sProcessor(){
//		return new A5();
//	}
}
