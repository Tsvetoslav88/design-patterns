package org.example;

public class Soy extends CondimentDecorator{
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public double price() {
        return beverage.price() + .05;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
