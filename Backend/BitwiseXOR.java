
import java.util.Scanner;

public class BitwiseXOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise XOR Operator in Java\n");
        System.out.print("Enter first number :");
        int first = input.nextInt();
        System.out.print("Enter second nnumber : ");
        int second = input.nextInt();
        int Result = first ^ second;
        System.out.println("the result of Xor is : " + Result);
    }
}
