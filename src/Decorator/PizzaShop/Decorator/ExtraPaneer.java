package Decorator.PizzaShop.Decorator;

import Decorator.PizzaShop.BasePizza;

public class ExtraPaneer extends ToppingDecorator {
    public ExtraPaneer(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public String getDescription() {
        return basePizza.getDescription() + " with Extra Paneer";
    }

    @Override
    public double cost() {
        return basePizza.cost() + 100;
    }
}
