public class Custom{//custom exception : Exception , unchecked custom exception : RuntimeException
    public static void main(String args[]){
        BankAccount account = new BankAccount();
        try{
            account.withdraw(1500);
        }catch(InsufficientFundsException e){
            System.out.println("Error : "+e.getMessage());
        }
    }
}

class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){
        super(message);
    }
}

class BankAccount{
    private double balance = 1000;

    public void withdraw(double amount)throws InsufficientFundsException{
        if(amount > balance){
            throw new InsufficientFundsException("not enought balance");
        }
        balance -= amount;
        System.out.println("Withdraw successfull new balance is : "+ (balance - amount));
    }
}
