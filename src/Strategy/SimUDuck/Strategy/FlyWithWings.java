package Strategy.SimUDuck.Strategy;

public class FlyWithWings implements IFlyingStrategy{
    @Override
    public void fly() {
        System.out.println("Flying with Wings");
    }
}
