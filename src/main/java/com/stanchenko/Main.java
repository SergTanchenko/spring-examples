package com.stanchenko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
		Basket basket = (Basket) applicationContext.getBean("basket");

		basket.getFruit().getName();
	}
}
