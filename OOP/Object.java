public class Object{
    public static void main(String[] args) {
        //object creation
        Car c1 = new Car("Hundayi",250000);
        Car c2 = new Car("Tata Nexon",1000000);
        
        //using methods
        c1.display();
        c2.display();
    }
    
}

class Car{
    //attributes
    String name = "";
    long price = 0;
    //constructor
    public Car(String name , long price){
        this.name = name;
        this.price = price;
    }
    //method
    public void display(){
        System.out.println("Name of car is : "+ name + " and worth $"+price);
    }
}