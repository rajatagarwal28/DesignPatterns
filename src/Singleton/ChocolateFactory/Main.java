package Singleton.ChocolateFactory;

public class Main {
    public static void main(String[] args) {
//        ChocolateBoiler cb = new ChocolateBoiler();

        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
        chocolateBoiler.fill();
        chocolateBoiler.boil();
        chocolateBoiler.drain();

    }
}
