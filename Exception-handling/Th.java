public class Th {
    // throw is to send the exception object (checked or unchecked)
    // throws is for the alert to the caller function that i might send you these excetions (checked)
    public static void main(String[] args) {
        int age = 15;
        if(age < 18){
            throw new IllegalArgumentException("Invalid input: Age must be 18 or above");
        }
        System.out.println("Eligilble for voting");
    }
}
