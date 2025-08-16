//copy constructor - use to copy the details from the other object
public class Copyconstructor {
    public static void main(String[] args) {
        Ball b1 = new Ball("SG Test","Red",156);
        Ball b2 = new Ball(b1);
        b1.toString();
        b2.toString();

    }
}

class Ball{
    String name = "";
    String color = "";
    int weight = 0;
    

    //parameterized constructor
    public Ball(String name , String color , int weight){
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    //copy constructor - use to copy the details from the other object
    public Ball(Ball obj){
        this.name = obj.name;
        this.color = obj.color;
        this.weight = obj.weight;
    }

    @Override
    public String toString(){
        String stringrepresentationofobject = "Ball {"+name+","+color+","+weight+"}";
        System.out.println(stringrepresentationofobject);
        return stringrepresentationofobject;
    }
}
