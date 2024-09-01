package Factory.PizzaStore;

import Factory.PizzaStore.Store.NYPizzaStore;
import Factory.PizzaStore.Store.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");
    }
}
