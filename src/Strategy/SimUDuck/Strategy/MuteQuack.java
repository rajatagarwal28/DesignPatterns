package Strategy.SimUDuck.Strategy;

public class MuteQuack implements IQuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Mute quack");
    }
}
