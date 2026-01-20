import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to digit sum calculator ");
        System.out.print("Please enter a intiger: ");
        int num = input.nextInt();
        int sum = digitSum(num);
        System.out.println("Sum of digit of " + num + " is: "+ sum);

    }

    public static int digitSum(int num){
        int sum = 0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;

    }
}
