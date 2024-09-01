package Decorator.PizzaShop;

public class Veggie extends BasePizza {

    public Veggie() {
        description = "Veggie";
    }
    @Override
    public double cost() {
        return 200;
    }
}
