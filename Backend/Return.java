
import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        System.out.println("Wlcome to basic sum calculator.....\n ");
        int first = readNumber() + 2;
        int second = readNumber() + 5;
        int sum = first + second;
        System.out.println("sum of the number is : " + sum);
        
        
    }

    public static int readNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number : ");
        int number = input.nextInt();
        return number;
    }


}
