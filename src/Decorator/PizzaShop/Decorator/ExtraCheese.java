package Decorator.PizzaShop.Decorator;

import Decorator.PizzaShop.BasePizza;

public class ExtraCheese extends ToppingDecorator {
    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public String getDescription() {
        return basePizza.getDescription() + " with Extra Chesse";
    }

    @Override
    public double cost() {
        return basePizza.cost() + 50;
    }
}
