// Q.3 --> write a program to demonstrate increment(++) and decrement(--) operators.

import java.util.Scanner;

public class Increment_decrement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of Number first: ");
        int a=sc.nextInt();
        int b=5;
        if (a==b) {
            a++;
            System.out.println(a);
        }
        else{
            a--;
            System.out.println(a);
        }
      
        
    }
    
}
