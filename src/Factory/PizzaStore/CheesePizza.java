package Factory.PizzaStore;

public class CheesePizza extends Pizza {
    IPizzaIngredientFactory ingredientFactory;
    public CheesePizza(IPizzaIngredientFactory ingredientFactory) {
        name = "Cheese Pizza";
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Pizza: " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();


    }
}
