package JavaMethods;

public class JavaMethods {
    //      Methods in Java
//      Methods are block(s) of code that do something specific
//      This methods can only work/run when they are called
//      Methods are used to reuse code

    //      Syntax:
//      A method is declared inside a class
//      its defined by name of the method followed by ()
//      example of an inbuilt method is System.out.println();
     static void printName(String name){
        System.out.println("Java is awesome !!!");
         System.out.println("My name is "+ name);
    }
//       printName : this is the name of the method
//      static : The method belongs to the JavaMethods(the class), and not an object of JavaMethods
//      void : This method DOES NOT return a value

    static void addition(int num1, int num2){
        System.out.println(num1 + num2);
    }

//Assignment : create a method that gets the difference between two numbers

    static void subtraction(int num2 ,int num3){
        System.out.println(num2 - num3);
    }

    //      Returning a value
// use void in a method when its not going to return a value
//if you want your method to return a value use
// primitive datatypes such as int ,char,INSTEAD of void and use "return" keyword inside the method

    static int multiply(int num1 ,int num2){
         int results = num1 * num2;
         return results;
    }

    static int multiply1(int num1 ,int num2){
        int results = num1 * num2;
        if (results > 100){
            return results;
        }else{
            return results + 100;
        }
    }
    public static void main(String[] args) {

        printName("Victor Kanja");

        addition(100,600);//takes a parameter num1 and num2(Any integer you give it)

        subtraction(100,200);

        int ans =multiply(12,12);
        System.out.println(ans);
        // or  System.out.println(multiply(12,12));

        int ans1 =multiply1(5,100);
        System.out.println(ans1);
    }
}
