package Qustions;

import java.util.Scanner;

public class Sum_Of_1_to_n {
    // Sum of all given number from 1 to N.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.print("Enter the value of N: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("Sum of 1 to Given Number is: "+sum);
        
    }
}
