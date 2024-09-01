package Strategy.SimUDuck;

import Strategy.SimUDuck.Strategy.IFlyingStrategy;
import Strategy.SimUDuck.Strategy.IQuackBehaviour;

public class Duck {
    IFlyingStrategy iFlyingStrategy;
    IQuackBehaviour quackBehaviour;

    Duck(IFlyingStrategy iFlyingStrategy, IQuackBehaviour quackBehaviour) {
        this.iFlyingStrategy = iFlyingStrategy;
        this.quackBehaviour = quackBehaviour;
    }
    public void quack() {
        quackBehaviour.quack();
    }
    public void fly() {
        iFlyingStrategy.fly();
    }

    public IFlyingStrategy getiFlyingStrategy() {
        return iFlyingStrategy;
    }

    public void setiFlyingStrategy(IFlyingStrategy iFlyingStrategy) {
        this.iFlyingStrategy = iFlyingStrategy;
    }

    public IQuackBehaviour getQuackBehaviour() {
        return quackBehaviour;
    }

    public void setQuackBehaviour(IQuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
