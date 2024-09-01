package Strategy.SimUDuck.Strategy;

public class FlyWithoutWings implements IFlyingStrategy{
    @Override
    public void fly() {
        System.out.println("Flying without Wings");
    }
}
