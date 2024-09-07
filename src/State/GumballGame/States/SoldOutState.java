package State.GumballGame.States;

import State.GumballGame.GumballMachine;

public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine machine) {
        gumballMachine = machine;
    }
    @Override
    public void insertCoin() {
        System.out.println("You cant insert coin, as no ball available");
    }

    @Override
    public void ejectCoin() {
        System.out.println("You haven't inserted the coin!!");
    }

    @Override
    public void turnCrank() {
        System.out.println("No gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("No gumballs");;
    }
}
