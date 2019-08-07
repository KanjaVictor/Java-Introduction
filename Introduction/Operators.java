package Introduction;

public class Operators {
    public static void main(String[] args) {
        //Operators in Java
// 1.Arithmetic
//2.Comparison
//3.Assignment
//4.Logical

//1.Arithmetic Operators
        //used to perform arithmetic operations

        int y = 3,x =4;
        System.out.println(y+x);
        System.out.println(4%3);

//2.Assignment operators
        //used to assign values to variables

        System.out.println(y+=x);
        System.out.println(y = y+x);

//3.Comparison operators
        //used to compare two values
        System.out.println(y == x);

//4.Logical operators
        //used to determine logic between two variables or values

        System.out.println(y < x && x > y);//logical and
        System.out.println(y < x || x < y);//logical or
        System.out.println((!(y < x && x > y)));//logical not

    }
}
