


import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
       
        System.out.println("Welcome to Multiplication Table Calculator\n ");
        System.out.print("Please enter a number you want to be create it table : ");
        MultiplicationTable();
    }


        public static void MultiplicationTable(){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(num +  " x "+ i + " = " + (num * i));
            i++;
        }
    }
       
    }

