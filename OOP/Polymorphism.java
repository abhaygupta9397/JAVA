// Polymorphism in Java is the ability of an object to take many forms, allowing the same method call to behave 
// differently depending on the actual object's type.


public class Polymorphism {
    public static void main(String[] args) {
        Ani cow = new Cow();
        Ani goat = new Goat();

        cow.says();
        goat.says();
    }

}

class Ani{
    public void says(){
        System.out.println("Animals says hi!");
    }
}

class Cow extends Ani{
    public void says(){
        System.out.println("Cow says maiiiiiiii...");
    }
}

class Goat extends Ani{
    public void says(){
        System.out.println("Goats says maiaiaiaiaiai....");
    }
}
