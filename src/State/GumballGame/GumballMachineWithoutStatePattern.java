package State.GumballGame;

public class GumballMachineWithoutStatePattern {
    final static int SOLD_OUT_STATE = 0;
    final static int NO_COIN_STATE = 1;
    final static int HAS_COIN_STATE = 2;
    final static int SOLD_STATE = 3;

    int state = SOLD_OUT_STATE;
    int count = 0;

    public GumballMachineWithoutStatePattern(int count) {
        this.count = count;
        this.state = (count > 0) ? NO_COIN_STATE : SOLD_OUT_STATE;
    }

    public void insertCoin() {
        if (state == HAS_COIN_STATE) {
            System.out.println("You cant insert another coin");
        } else if (state == NO_COIN_STATE) {
            state = HAS_COIN_STATE;
            System.out.println("You inserted the coin!!");
        } else if (state == SOLD_OUT_STATE) {
            System.out.println("You cant insert coin, as the machine is sold out");
        } else if (state == SOLD_STATE) {
            System.out.println("Wait, Machine is ejecting a gumball");
        }
    }

    public void ejectCoin() {
        if (state == HAS_COIN_STATE) {
            System.out.println("Ejecting coin");
            state = NO_COIN_STATE;
        } else if (state == NO_COIN_STATE) {
            System.out.println("You haven't inserted the coin!!");
        } else if (state == SOLD_STATE) {
            System.out.println("We cant eject coin back, as you already turned the crank");
        } else if (state == SOLD_OUT_STATE) {
            System.out.println("You haven't inserted the coin!!");
        }
    }

    public void turnCrank() {
        if (state == HAS_COIN_STATE) {
            System.out.println("You turned the crank, dispensing the ball");
            state = SOLD_STATE;
            dispense();
        } else if (state == NO_COIN_STATE) {
            System.out.println("You haven't inserted the coin, cant turn the crank");
        } else if (state == SOLD_STATE) {
            System.out.println("You cant turn the crank twice");
        } else if (state == SOLD_OUT_STATE) {
            System.out.println("No gumballs");
        }
    }

    public void dispense() {
        if (state == SOLD_STATE) {
            System.out.println("Dispensing the ball");
            count--;
            state = count > 0 ? NO_COIN_STATE : SOLD_OUT_STATE;
        } else if (state == NO_COIN_STATE) {
            System.out.println("You haven't inserted the coin");
        } else if (state == HAS_COIN_STATE) {
            System.out.println("You have to turn the crank");
        } else if (state == SOLD_OUT_STATE) {
            System.out.println("No gumballs");
        }
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "inventory=" + count +
                '}';
    }
}
