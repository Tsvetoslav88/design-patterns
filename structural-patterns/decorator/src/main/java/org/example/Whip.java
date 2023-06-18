package org.example;

public class Whip extends CondimentDecorator{
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public double price() {
        return beverage.price() + .10;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
