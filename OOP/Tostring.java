//  objectName.toString() returns a string representation of the object — by default ClassName@hashcode,
//  but usually overridden to give meaningful details.

public class Tostring {
    public static void main(String[] args) {
        Laptop acer = new Laptop("acer");
        acer.toString();
    }
}
class Laptop{
    String name;
    public Laptop(String name){
        this.name = name;
    }
    
    @Override
    public String toString(){
        System.out.println("laptop name is : "+name);
        return "laptop {name is : "+name+"}";
    }
}
