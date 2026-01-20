
import java.util.Scanner;

public class BitwiseAND {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise AND Operator in Java\n");
        System.out.print("please enter the first number : ");
        int first = input.nextInt();
        System.out.print("please enter the second number : ");
        int second = input.nextInt();
        int result = first & second;
        System.out.println("Result is " + result);
    }
}
