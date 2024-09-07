package State.GumballGame.States;

import State.GumballGame.GumballMachine;

public class WinnerState implements State {
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine machine) {
        gumballMachine = machine;
    }
    @Override
    public void insertCoin() {
        System.out.println("You cant insert another coin");
    }

    @Override
    public void ejectCoin() {
        System.out.println("you cant eject coing");
    }

    @Override
    public void turnCrank() {
        System.out.println("You cant turn the crank");
    }

    @Override
    public void dispense() {
        System.out.println("Release ball");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.releaseBall();
            if(gumballMachine.getCount() > 0) {
                this.gumballMachine.setState(gumballMachine.getNoCoinState());
            } else {
                this.gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        } else {
            this.gumballMachine.setState(gumballMachine.getSoldOutState());
        }

    }

}
