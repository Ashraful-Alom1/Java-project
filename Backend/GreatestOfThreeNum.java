
import java.util.Scanner;

public class GreatestOfThreeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to comparing calculator\n");
        System.out.print("Enter your first number : ");
        float Num1 = input.nextFloat();
        System.out.print("Enter your secoond number : ");
        float Num2 = input.nextFloat();
        System.out.print("Enter your third number : ");
        float Num3 = input.nextFloat();
        if(Num1>Num2 && Num1>Num3)
        {
            System.out.println(Num1 + " is greatest among them");
        }
        else if (Num2>Num1 && Num2>Num3)
        {
            System.out.println(Num2 + " is greatest among them");
        }
        else 
        {
            System.out.println(Num3 + " is greatest among them");
        }
        
    }
}
