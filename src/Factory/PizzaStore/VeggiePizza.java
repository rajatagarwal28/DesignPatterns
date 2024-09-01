package Factory.PizzaStore;

public class VeggiePizza extends Pizza {
    IPizzaIngredientFactory ingredientFactory;
    public VeggiePizza(IPizzaIngredientFactory ingredientFactory) {
        name = "Veggie Pizza";
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
