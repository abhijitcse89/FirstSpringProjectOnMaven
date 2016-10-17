package com.abhijit.FirstMavenAnnotationBased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //Non qualified De capitalized
// by default ====> @component(samsung)
public class Iphone {
	@Autowired
	@Qualifier("a5")
	private Processor processor;
	
	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}


	void config(){
		System.out.println("Model=5s, Ram = 1GB, Camera = 8 MP");
		processor.cpu();
	}
}
