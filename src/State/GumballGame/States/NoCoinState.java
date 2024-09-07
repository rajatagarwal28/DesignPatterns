package State.GumballGame.States;

import State.GumballGame.GumballMachine;

public class NoCoinState implements State {
    GumballMachine gumballMachine;

    public NoCoinState(GumballMachine machine) {
        gumballMachine = machine;
    }
    @Override
    public void insertCoin() {
        System.out.println("You inserted a coin");
        this.gumballMachine.setState(gumballMachine.getHasCoinState());
    }

    @Override
    public void ejectCoin() {
        System.out.println("You haven't inserted the coin!!");

    }

    @Override
    public void turnCrank() {
        System.out.println("You haven't inserted the coin, cant turn the crank");
    }

    @Override
    public void dispense() {
        System.out.println("You cant, pay first");
    }
}
