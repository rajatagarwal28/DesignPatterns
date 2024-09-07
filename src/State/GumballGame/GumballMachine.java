package State.GumballGame;

import State.GumballGame.States.*;

public class GumballMachine {
    State noCoinState;
    State hasCoinState;
    State soldOutState;
    State soldState;
    State winnerState;

    State state;

    public int getCount() {
        return count;
    }

    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        soldOutState = new SoldOutState(this);
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.state = (count > 0) ? noCoinState : soldOutState;
    }

    public void insertCoin() {
        state.insertCoin();
    }

    public void ejectCoin() {
        state.ejectCoin();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("Gumball coming out");
        if (count > 0) {
            count--;
        }
    }


    public void setState(State state) {
        this.state = state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }


    public State getHasCoinState() {
        return hasCoinState;
    }


    public State getNoCoinState() {
        return noCoinState;
    }


    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void setWinnerState(State winnerState) {
        this.winnerState = winnerState;
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "inventory=" + count +
                '}';
    }
}
