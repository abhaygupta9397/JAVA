//Method overriding in Java is when a subclass provides its own implementation of a method 
//already defined in its superclass, keeping the same name, parameters, and return type (or a subtype).


public class MethodOverriding{
    public static void main(String[] args){
        Bat b1 = new Bat();
        Bat mrf = new MRF();

        b1.company();
        mrf.company();
    }
}

class Bat{
    public void company(){
        System.out.println("generic bat no brand");
    }
}

class MRF extends Bat{
    @Override
    public void company(){
        System.out.println("MRF the legendary bat to play with.");
    }
}