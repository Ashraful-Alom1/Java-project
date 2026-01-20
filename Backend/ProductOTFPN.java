
import java.util.Scanner;

public class ProductOTFPN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any two numbers ");
        System.out.print("Enter first number A : ");
        float A = input.nextFloat();
        System.out.print("Enter second number B : ");
        float B = input.nextFloat();
        float product = A * B;
        System.out.println("product of given number is : "+ product);

    }
}
