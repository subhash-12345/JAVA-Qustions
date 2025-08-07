// Q.11 --> Write a programm to find the factorial of a number using a while loop.

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number that factorial you want: ");
        int num=sc.nextInt();
        int fact=1;
        int i=1;
        while(i<=num){
            fact=fact*i;
            i++;
        }
        if(fact==0||fact==1){
            System.out.println("Factorial is: 1");
        }
        else{
            System.out.println("Factorial of "+num+" is: "+fact);
        }

    }
    
}
