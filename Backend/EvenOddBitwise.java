
import java.util.Scanner;

public class EvenOddBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to even/odd calculator : ");
        System.out.print("Enter your number : ");
        int num = input.nextInt();
        
        if((num & 1) ==1)
        {
            System.out.println("Your number is Odd");
        }
        else 
        {
            System.out.println("Your number is Even");
        }
    }
}
