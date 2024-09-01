package Decorator.CoffeeShop.Decorator;

import Decorator.CoffeeShop.Beverage;

public abstract class CondimentsDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}
