
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd Even checking program\n");
        System.out.print("Enter a Number : ");
        double Num = input.nextDouble();
        if(Num%2==0)
        {
            System.out.println("Given Number " + Num + " is a Even number");
        }
        else {
            System.out.println("Given number " + Num + " is a Odd number");
        }
    }
}
