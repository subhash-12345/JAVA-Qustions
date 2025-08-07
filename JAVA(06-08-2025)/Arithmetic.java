// Q.1 -->  write a program to perform all operation on two numbers.

import java.util.Scanner;

public class Arithmetic{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of Number one: ");
        int a=sc.nextInt();
        System.out.print("Enter value of Number Second: ");
        int b=sc.nextInt();

        int sum=a+b;
        int sub=a-b;
        int mul=a*b;
        int div=a/b;
        int mod=a%b;

        System.out.println("Sum of A and B: "+sum);
        System.out.println("Sub of A and B: "+sub);
        System.out.println("Multiplication of A and B: "+mul);
        System.out.println("Division of A and B: "+div);
        System.out.println("Modulous of A and B: "+mod);
       

    }
}