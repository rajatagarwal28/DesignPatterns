package Factory.PizzaStore.Ingredients;

public class Dough {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dough(String name){
        this.name = name;
    }

}
