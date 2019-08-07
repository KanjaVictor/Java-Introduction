package Inheritance;

public class MyClass {
    //use the keyword extends
    protected String name = "Developer";

    public void languages() {
        System.out.println("1.HTML\n 2.CSS\n 3.Java\n 4.Android");
    }
}
    class InnerClass extends MyClass{
        private String technologies = "Android Development";

        public static void main (String []args){
            InnerClass newlangueges = new InnerClass();

            System.out.println(newlangueges.name);
            System.out.println(newlangueges.technologies);
            newlangueges.languages();

        }
    }

