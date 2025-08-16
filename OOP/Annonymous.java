public class Annonymous {
    public static void main(String[] args) {
        //reference of the object is not stored so we call it annonymous object in java
        new Book("The Greatness Guide","Robin Sharma").toString();
    }
}
class Book{
    String title = "";
    String author = "";
    public Book(String title , String author){
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString(){
        String stringRepresetationOfObject = "Book : {"+title+","+author+"}";
        System.out.println(stringRepresetationOfObject);
        return stringRepresetationOfObject;
    }
}
