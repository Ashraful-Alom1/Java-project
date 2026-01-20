public class MethodUsingInJava {
    public static void main(String[] args) {
        printFirstPattern();
        printSecondPattern();
        printThirdPattern();
        
    }
    public static void printFirstPattern() {

        System.out.println("*\n* *\n* * *\n* * * *\n* * * * *");
    }

    public static void printSecondPattern() {

         System.out.println("* * * * *\n* * * *\n* * *\n* *\n*");
    }

    public static void printThirdPattern() {

        int rows = 0;
        while(rows<25){
        System.out.print("*");
        int i = 0;
        while(i<rows){
            System.out.print(" *");
            i++;
        }
        System.out.println();
        rows++;
        }
    }
}
