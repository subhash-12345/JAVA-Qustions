package Qustions;

import java.util.Scanner;

public class Factorial {
    //  Print Factorial
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mul=1;
        System.out.print("Enter Number that Factorial you want: ");
        int fact=sc.nextInt();
        for(int i=1;i<=fact;i++){
            mul=mul*i;
        }
        System.out.println("Factorial of given number is: "+mul);
    }
}
