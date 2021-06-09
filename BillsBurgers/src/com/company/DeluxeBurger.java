package com.company;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe Burger", "chicken", 14, "Brown");
        super.addHamburgerAddition1("Chips",2);
        super.addHamburgerAddition2("Drink",4);
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("This action cannot be done");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("This action cannot be done");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("This action cannot be done");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("This action cannot be done");
    }

    @Override
    public double itemizeHamburger() {
        return super.itemizeHamburger();
    }
}
