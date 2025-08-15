public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Pomeranian";
        d.bark();
        d.eat();
    }
}

class Animal{
    String name = "";
    public void eat(){
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("Dog is barking.");
    }
}