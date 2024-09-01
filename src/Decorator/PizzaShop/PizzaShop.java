package Decorator.PizzaShop;

import Decorator.PizzaShop.Decorator.ExtraCheese;
import Decorator.PizzaShop.Decorator.ExtraPaneer;

public class PizzaShop {
    public static void main(String[] args) {
        BasePizza farmHouse = new FarmHouse();
        System.out.println(farmHouse.getDescription() + " $" + farmHouse.cost());

        BasePizza veggie = new Veggie();
        System.out.println(veggie.getDescription() + " $" + veggie.cost());

        veggie = new ExtraCheese(veggie);
        System.out.println(veggie.getDescription() + " $" + veggie.cost());

        veggie = new ExtraPaneer(veggie);
        System.out.println(veggie.getDescription() + " $" + veggie.cost());

    }
}
