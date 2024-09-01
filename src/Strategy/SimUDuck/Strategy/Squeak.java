package Strategy.SimUDuck.Strategy;

public class Squeak implements IQuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Squeaking");
    }
}
