
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Palindrome number system\n ");
        System.out.print("please enter your number: ");
        int  num = input.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if(isPalindrome){
            System.out.println("Your number is palindrome number");
        }
        else{
            System.out.println("Your number is not palindrome");
        }

    }


    public static boolean isPalindrome(int num){
        int reverse = reverse(num);

        return num == reverse;
    }


    public static int reverse(int num){
        int newNum = 0;
        while(num>0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num/=10; 


        }
        return newNum;

    }
    
}
