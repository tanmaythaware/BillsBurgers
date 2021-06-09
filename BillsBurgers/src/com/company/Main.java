package com.company;

public class Main {

    public static void main(String[] args) {
	    Hamburger hamburger = new Hamburger("Large Burger","Turkey",10,"Brown");
		hamburger.itemizeHamburger();
	    hamburger.addHamburgerAddition1("Tomato",2);
	    hamburger.addHamburgerAddition2("Kanda",3);
	    hamburger.itemizeHamburger();

		
	    DeluxeBurger deluxeBurger = new DeluxeBurger();
	    deluxeBurger.addHamburgerAddition1("Lassan",5);
	    deluxeBurger.itemizeHamburger();

	    HealthyBurger healthyBurger = new HealthyBurger("Chicken",20);
	    healthyBurger.addHealthyAddition1("Cucumber",1);
	    healthyBurger.addHealthyAddition2("Tomato",3);
	    healthyBurger.itemizeHamburger();

	    healthyBurger.addHamburgerAddition1("lettuce",5);
	    healthyBurger.itemizeHamburger();
    }
}
