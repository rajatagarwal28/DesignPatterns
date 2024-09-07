package State.GumballGame.States;

import State.GumballGame.GumballMachine;

public class HasCoinState implements State {
    GumballMachine gumballMachine;

    public HasCoinState(GumballMachine machine) {
        gumballMachine = machine;
    }
    @Override
    public void insertCoin() {
        System.out.println("You cant insert another coin");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Ejecting coin");
        this.gumballMachine.setState(gumballMachine.getNoCoinState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned the crank, dispensing the ball");
        this.gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("You have to turn the crank");
    }
}
