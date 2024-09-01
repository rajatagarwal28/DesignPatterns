package Factory.PizzaStore.Store;

import Factory.PizzaStore.IPizzaIngredientFactory;
import Factory.PizzaStore.Pizza;

public abstract class PizzaStore {
    public final Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }

        return pizza;
    }

    public abstract Pizza createPizza(String type);

}
