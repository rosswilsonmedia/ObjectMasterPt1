package com.objectmasterpt1;

public class TestHuman {

	public static void main(String[] args) {
		Human dipinder = new Human();
		Human james = new Human();
		dipinder.attack(james);
		dipinder.showHealth();
		james.showHealth();
	}

}
