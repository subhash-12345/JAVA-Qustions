// Q.5 --> Write a program to check number is positive, negative or zero using if-else

import java.util.Scanner;

public class Check_positive_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of number that you want to check: ");
        int a=sc.nextInt();
        if (a<0) {
            System.out.println("Value is -ve");
        }
        else if(a>0){
            System.out.println("Value is +ve");
        }
        else{
            System.out.println("VAlue is zero");
        }
    }
    
}
