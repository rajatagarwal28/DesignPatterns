package Strategy.SimUDuck;

import Strategy.SimUDuck.Strategy.FlyWithoutWings;
import Strategy.SimUDuck.Strategy.Squeak;

public class MallardDuck extends Duck {
    MallardDuck() {
        super(new FlyWithoutWings(), new Squeak());
    }
}
