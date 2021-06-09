package com.company;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price = 0;
    private String healthyExtra2Name;
    private double healthyExtra2Price = 0;

    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", meat, price, "White");
    }

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price){
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
    }

    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price){
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice =  getPrice()+healthyExtra1Price+healthyExtra2Price;
        if(healthyExtra1Price!=0){
            System.out.println("Added " + healthyExtra1Name + " for extra " + healthyExtra1Price + "$");
        }
        if(healthyExtra2Price!=0){
            System.out.println("Added " + healthyExtra2Name + " for extra " + healthyExtra2Price + "$");
        }
        System.out.println("Total price is " + totalPrice);
        return totalPrice;
    }
}
