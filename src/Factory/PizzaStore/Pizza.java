package Factory.PizzaStore;

import Factory.PizzaStore.Ingredients.Cheese;
import Factory.PizzaStore.Ingredients.Dough;
import Factory.PizzaStore.Ingredients.Sauce;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;


    public abstract void prepare();
    public void bake() {
        System.out.println("Bake Pizza");
    }
    public void cut(){
        System.out.println("Cut Pizza");
    }
    public void box() {
        System.out.println("Box Pizza");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
