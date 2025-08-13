import java.util.Scanner;
public class RandomNumber {
    public static void main(String args[])throws InterruptedException{

      System.out.println("Welcome to the Guess the Number Game from 0 to 100");  
      Scanner sc = new Scanner(System.in);
      
      
      int attempts = 5;
      int num = 45;
      boolean won = false;
      while(attempts > 0){
          Thread.sleep(1000);  // compile time exception - compiler complains
        
        System.out.println("Guess a Number");
        int input = sc.nextInt();
        Thread.sleep(500);
        if(num < input){
            System.out.println("you entered the higher number");
        }else if(num > input){
            System.out.println("You entered the lower number");
        }else{
            System.out.println("You Won! the number is : "+num);
            won = true;
            System.exit(0);
        }
        Thread.sleep(500);
        attempts--;
        System.out.println(attempts+"Attempts left");
      }
      if(!won){
        System.out.println("TRY NEXT TIME! You cannot guess the number");
      }
      sc.close();
    }
}
