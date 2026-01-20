
import java.util.Scanner;

public class SumTN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my basic calculator");
        System.out.print("Enter first number : ");
        int firstNum = input.nextInt();
        System.out.print("Now please enter second number : ");
        int seconNum = input.nextInt();
        int sum = firstNum + seconNum ; 
        System.out.println("sum of "+ firstNum + " And "+ seconNum +" is = "+ sum);
    }
}
