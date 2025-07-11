package com.tnsif.Shopping;

import org.springframework.stereotype.Component;

@Component
public class Food implements Ordering{
	public void order() {
		System.out.println("I'm ordering food");
	}

}
