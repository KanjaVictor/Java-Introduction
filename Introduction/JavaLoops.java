package Introduction;

public class JavaLoops {
    public static void main(String[] args) {
        //syntax :while loop
        //while(condition){
        // code to execute}

        int x = 0;
            while(x < 10){
                System.out.println(x);
                x++;
            }
        // syntax :for loop
        //for(statement 1, statement 2, statement 3){
        // code to execute
        // statement 1 - is executed once before the execution of the code
        // statement 2 -defines the condition for executing the code block
        // statement 3 - is executed every time the condition(statement)
        // }

        for (int i = 0;i < 10;i++){
            System.out.println(i);
        }
        //syntax :foreach loop
        //used to loop through arrays
        String[] cars = {"BMW","NYAYO"};

        for (String c : cars){
            System.out.println(c);
        }

        //Combining while and if
        int y = 0;
        while(y < 10) {
            System.out.println(y);
            y++;
            if (y == 5) {
                System.out.println(y);
                System.out.println("Hello Kanja");
                break;
            }
        }
            int z = 0;
            while(z < 10){
                if (z == 5){
                    z++;
                    System.out.println("Hello Victor");
                    continue;
                }
                System.out.println(z);
                z++;
            }
        }
    }

