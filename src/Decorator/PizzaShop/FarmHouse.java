package Decorator.PizzaShop;

public class FarmHouse extends BasePizza {

    public FarmHouse() {
        description = "FarmHouse";
    }
    @Override
    public double cost() {
        return 400;
    }
}
