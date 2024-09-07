package State.GumballGame;

public class Main {
    public static void main(String[] args) {
//        GumballMachineWithoutStatePattern machine = new GumballMachineWithoutStatePattern(5);
        GumballMachine machine = new GumballMachine(5);

        System.out.println(machine);

        machine.insertCoin();
        machine.turnCrank();
        System.out.println(machine);

        System.out.println("----------");
        machine.insertCoin();
        machine.ejectCoin();
        machine.turnCrank();
        System.out.println(machine);

        System.out.println("----------");
        machine.insertCoin();
        machine.turnCrank();
        machine.insertCoin();
        machine.turnCrank();
        machine.ejectCoin();
        System.out.println(machine);

        System.out.println("----------");
        machine.insertCoin();
        machine.insertCoin();
        machine.turnCrank();
        machine.insertCoin();
        machine.turnCrank();
        machine.insertCoin();
        machine.turnCrank();
        System.out.println(machine);



    }
}
