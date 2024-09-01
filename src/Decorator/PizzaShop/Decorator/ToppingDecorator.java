package Decorator.PizzaShop.Decorator;

import Decorator.PizzaShop.BasePizza;

public abstract class ToppingDecorator extends BasePizza {
    BasePizza basePizza;
    public abstract String getDescription();
}
