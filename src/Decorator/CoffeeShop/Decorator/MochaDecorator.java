package Decorator.CoffeeShop.Decorator;

import Decorator.CoffeeShop.Beverage;

public class MochaDecorator extends CondimentsDecorator {
    public MochaDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 20;
    }
}
