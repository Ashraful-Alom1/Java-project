
import java.util.Scanner;
public class SumAllOddSpecificN {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the specific sum of all numbers ");
        System.out.print("Please enter your number : ");
        int num = input.nextInt();
        int sum = sumOddNumbers(num);
        System.out.println("sumOddNumber till " + num + " is: "+ sum);


    }

    public static int sumOddNumbers(int num) {
        int sum = 0;
         int i = 1;
         while(i<=num){
            sum = i+sum;
            i+=2;
         }

       return sum;
    

        
    }
}
