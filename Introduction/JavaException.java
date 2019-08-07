package Introduction;

public class JavaException {
    static void checkAge(int age){
        if (age < 18){
            throw new ArithmeticException("Access denied . you are under age");
        }else {
            System.out.println("Access Granted");
        }
    }
    //methods are created outside the main method then called in the main method
    public static void main(String[] args) {
        //try -  define a block of code that you want to test
        //catch - define a block of code to execute if there is an error in the try block
        //dry
        //throw:Allows you to create custom methods
        //:used together with exception type e.g
       //ClassNotFoundException,  ArithmeticException
       // ArrayIndexOutOfBoundsException,SecurityException
        // :Often used with custom methods
        checkAge(18);
        try{
            int[]numbers = {4,3,2,1};
            System.out.println(numbers[4]);
            //an error will be thrown since there is no index 4 in the array
        }catch (Exception e){
            System.out.println("Something went wrong :"+ e);
        }finally {
            System.out.println("I will run regardless of an error or a success");
        }
    }
}
