
import java.util.Scanner;

public class PattensPrint3types {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to pattern print program\n ");
        System.out.print("Enter a number to print pattern: ");
        int num = input.nextInt();
        rightHalf(num);
        reverseRight(num);
        leftHalf(num);


    }


    public static void rightHalf(int num){
        System.out.println("\nHere is the rightHalf pattern\n");

        int rows = 0;
        while(rows<num){
            System.out.print("*");
        
            int i = 0;
            while(i<rows){
                System.out.print(" *");
                i++;
               
            }
            System.out.println();
            rows++;

            }
        }

    

    

    public static void reverseRight(int num){
        System.out.println("\nHere is the reverseRIght Pattern\n");
        int rows = num;
        while(rows>0){
            int i = 0;
            while(i<rows){
            System.out.print("* ");
            i++;
            }

              System.out.println();
         rows--;

        }
     
     }



    public static void leftHalf(int num){

        System.out.println("\nHere is the leftHalf pattern\n");
        int rows = num;
        while(rows>0){
            int j = 0;
            while(j<rows - 1){
                System.out.print("  ");
                j++;
            }
            int i = 0;
            while(i<=(num - rows)){
                System.out.print("* ");
                i++;
            }

            System.out.println();
            rows--;
        }

    }

}
