
import java.util.Scanner;

public class BitwiseOR {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Showcasing Bitwise OR operator in java\n");
    System.out.print("Enter first number: ");
    int first = input.nextInt();
    System.out.print("Enter second number: ");
    int second = input.nextInt();
    int result = first | second ;
    System.out.println("Result is " + result);
   } 
}
