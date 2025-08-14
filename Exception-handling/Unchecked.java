public class Unchecked {
    //unchecked exception - ArithmeticException , NullPointerException , ArrayIndexOutOfBoundException
    public static void main(String[] args) {

        //NullPointerException
        String st = null;
        
        int len = 0;
        try {
            len = st.length();
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        
       //ArrayIndexOutOfBoundException
        int arr[] = new int[5];

        try{
            arr[5] = 90;
        }catch(Exception e){
            System.out.println(e.toString());
        }
        
        //ArithmeticException
        int result = 0;
        try{
            result = division(20,0);
        }catch(Exception e){
            System.out.println(e.toString());
        }
        System.out.println(result);
    }

    public static int division(int a , int b){
        int result = a / b;
        System.out.println(result);
        return result;
    }
}
