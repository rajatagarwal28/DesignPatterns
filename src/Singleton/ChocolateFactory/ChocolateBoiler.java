package Singleton.ChocolateFactory;

public class ChocolateBoiler {
    private static ChocolateBoiler uniqueChocolateBoiler;
    private boolean empty;
    private boolean boiled;

//    public ChocolateBoiler() {
//        empty = true;
//        boiled = false;
//    }
    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance(){
        if(uniqueChocolateBoiler == null){
            uniqueChocolateBoiler = new ChocolateBoiler();
        }
        return uniqueChocolateBoiler;
    }

    public void fill() {
        if(isEmpty()) {
            empty = true;
            boiled = false;
        }
    }

    public void boil() {
        if(!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public void drain() {
        if(!isEmpty() && isBoiled()) {
            empty = true;
        }
    }


    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
