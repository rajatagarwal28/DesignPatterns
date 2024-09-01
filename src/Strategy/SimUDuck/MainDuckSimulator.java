package Strategy.SimUDuck;

import Strategy.SimUDuck.Strategy.FlyWithWings;
import Strategy.SimUDuck.Strategy.MuteQuack;

public class MainDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.fly();
        mallardDuck.quack();

        mallardDuck.setiFlyingStrategy(new FlyWithWings());
        mallardDuck.setQuackBehaviour(new MuteQuack());

        mallardDuck.fly();
        mallardDuck.quack();





    }
}
