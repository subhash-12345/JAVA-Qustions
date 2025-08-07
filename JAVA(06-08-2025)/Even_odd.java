// Q.3 --> Write a program to check if a number is even or odd using the modulus operator.

import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number that you want to check: ");
        int num=sc.nextInt();
        if (num%2==0) {
            System.out.println("Given number is Even");
        }
        else{
            System.out.println("Given number is odd");
        }
    }
    
}
