// Abstraction in Java is the concept of hiding implementation details and showing
// only the essential features to the user, achieved using abstract classes or interfaces.

public class Abstraction {
        public static void main(String[] args) {
        Veh v = new Ca(); // Vehicle reference, Car object
        v.start(); // Car starts with a key
        v.stop();  // Vehicle stopped
    }
}

abstract class Veh {
    abstract void start(); // abstract method - no body

    public void stop() {   // concrete method
        System.out.println("Vehicle stopped");
    }
}

class Ca extends Veh {
    @Override
    void start() {
        System.out.println("Car starts with a key");
    }
}


