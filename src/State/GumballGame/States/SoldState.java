package State.GumballGame.States;

import State.GumballGame.GumballMachine;

public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine machine) {
        gumballMachine = machine;
    }
    @Override
    public void insertCoin() {
        System.out.println("You cant insert  coin as we are dispensing");
    }

    @Override
    public void ejectCoin() {
        System.out.println("you cant eject coin, as you turn the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("you cant turn crank twice");
    }

    @Override
    public void dispense() {
        System.out.println("Release ball");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            this.gumballMachine.setState(gumballMachine.getNoCoinState());
        } else {
            this.gumballMachine.setState(gumballMachine.getSoldOutState());
        }

    }
}
