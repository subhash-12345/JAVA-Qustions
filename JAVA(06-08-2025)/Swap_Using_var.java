// Q.2 -->  Write a program to swap two numbers using a temporary variable and using arithmetic operaors(no temp)

import java.util.Scanner;

public class Swap_Using_var {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of Number First: ");
        int a=sc.nextInt();
        System.out.print("Enter value of Number Second: ");
        int b=sc.nextInt();

        int var;
        var=a;
        a=b;
        b=var;

        System.out.println("Values After Swaping");
        System.out.printf("Number first=%d\nNumber Second=%d",a,b);
        
    }
    
}
