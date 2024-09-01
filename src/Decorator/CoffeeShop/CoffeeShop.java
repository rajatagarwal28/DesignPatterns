package Decorator.CoffeeShop;

import Decorator.CoffeeShop.Decorator.MochaDecorator;
import Decorator.CoffeeShop.Decorator.WhipDecorator;

public class CoffeeShop {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        beverage2 = new MochaDecorator(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        beverage2 = new WhipDecorator(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

    }
}
