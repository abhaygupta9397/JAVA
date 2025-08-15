//Inheritance → “is-a” relationship (Dog is a Animal).
//Composition → “has-a” relationship (Car has a Engine).

public class Composition {
    public static void main(String[] args) {
        Carr c = new Carr();
        c.drive();
    }
}
class Engine {
    public void start(){
        System.out.println("Engine starting...");
    }
}

class Carr {
    private Engine engine = new Engine();
    public void drive() {
        engine.start(); // Using Engine inside Car
        System.out.println("Car is driving...");
    }
}
