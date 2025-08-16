//Defines a contract (can-do) for classes; unrelated classes can implement it.
public class Interface {
    public static void main(String[] args) {
        Bird b = new Bird("Peacock");
        b.fly();
        b.swim();

        Aeroplane a = new Aeroplane("Virgin");
        a.fly();
        b.swim();
    }
}

interface flyable{
   public void fly();
}

interface swimable{
    public void swim();
}

class Bird implements flyable , swimable{
      String name = "";
      Bird(String name){
        this.name = name;
      }

      public void fly(){
        System.out.println("Bird can fly..");
      }

      public void swim(){
        System.out.println("Bird cannot swim..");
      }
}


class Aeroplane implements flyable , swimable{
    String name = "";

    public Aeroplane(String name){
        this.name = name;
    }

    public void fly(){
        System.out.println("Aeroplane can fly at higher altitudes..");
    }

    public void swim(){
        System.out.println("Aeroplane cannot swim..");
    }
}