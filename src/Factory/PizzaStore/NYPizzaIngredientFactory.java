package Factory.PizzaStore;

import Factory.PizzaStore.Ingredients.*;

public class NYPizzaIngredientFactory implements IPizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MorzillaCheese();
    }
}
