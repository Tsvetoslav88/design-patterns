package org.example;

public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public double price() {
        return beverage.price() + .20;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
