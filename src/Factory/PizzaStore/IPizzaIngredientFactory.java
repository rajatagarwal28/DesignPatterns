package Factory.PizzaStore;

import Factory.PizzaStore.Ingredients.Cheese;
import Factory.PizzaStore.Ingredients.Dough;
import Factory.PizzaStore.Ingredients.Sauce;

public interface IPizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
//    public Vegggies[] createVeggies();
//    public Pepperoni createPepperoni();
//    public Clams createClam();

}
