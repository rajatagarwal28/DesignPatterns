package Singleton;

public class Singleton {
    private static Singleton uniqueInstance;

    // private empty constructor
    private Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
