package Introduction;

public class JavaArrays {
    public static void main(String[] args) {
        //Declaring an array
      //  state the type, the square brackets and the name
        //examples:
        String[]cars;//empty array
        String[]languages ={"HTML","PHP","JAVA"};

        int[]numbers;//empty array
        int[]myNumbers ={1,2,3,4,5};

        System.out.println(myNumbers[1]);

        //Accessing items
        //languages[0]
        System.out.println(languages[0]);
        //Change an item in an array
        languages[0] = "Ruby";
        System.out.println(languages[0]);
        //Checking the number items in the arrays
        System.out.println(languages.length);

        for (String language : languages){
            System.out.println(language);
        }

        for (int a= 0; a < languages.length;a++){
            System.out.println(languages[a]);
        }
    }
}
