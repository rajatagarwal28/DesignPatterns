package Decorator.PizzaShop;

public abstract class BasePizza {
    String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
