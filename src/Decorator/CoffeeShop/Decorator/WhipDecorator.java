package Decorator.CoffeeShop.Decorator;

import Decorator.CoffeeShop.Beverage;

public class WhipDecorator extends CondimentsDecorator {
    public WhipDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 10;
    }
}
