package Factory.PizzaStore.Store;

import Factory.PizzaStore.*;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        IPizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
        }
        return pizza;
    }
}
