package org.example;

public class Milk extends CondimentDecorator{
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public double price() {
        return beverage.price() + .15;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
