package Introduction;

public class IfConditions {
    public static void main(String[] args) {
        int a = 10, b = 5;
        //syntax :if(condition){
        // code to execute}

        if (a > b){
            System.out.println("a is greater than b");
        }
        //syntax :if(condition){
        // code to execute}else{
        // code to execute if the first condition is false}

        if (a < b){
            //runs if condition is true
            System.out.println("a is greater than b");
        }else{
            //runs if condition is false
            System.out.println("b is less than a");
        }

        //syntax :if(condition){
        // code to execute}
        // else if{
        // code to execute if the first condition is false}
        //else{
        //  code to execute if the second condition is false}

        if (a < b){
            //runs if the condition is true
            System.out.println("a is less than b");
        } else if(b < a){
            System.out.println("b is less than a");
        }else{
            System.out.println("Runs if the above conditions are all false");
        }

    }

}
