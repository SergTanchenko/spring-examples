package com.stanchenko;

import com.stanchenko.fruits.Fruit;

public class Basket {

	private Fruit fruit;

	public Basket(Fruit fruit) {
		this.fruit = fruit;
	}

	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}

	Fruit getFruit() {
		System.out.println("AOP: Basket.getFruit()");
		return fruit;
	}
}
