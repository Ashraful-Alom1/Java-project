
import java.util.Scanner;

public class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to showcase of not/Compliment in java\n");
        System.out.print("Enter your number :");
        int num = input.nextInt();
        int ressult = ~num;
        System.out.println("~" + num + " = " + ressult);
        


    }
}
