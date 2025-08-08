package Qustion_next;
//  Write a method to find maximum number B/W three numbers

import java.util.Scanner;

class A{
    void max(int x, int y, int z){
        if (x>y && x>z){
            System.out.println("X is greater");
        } else if (y>x && y>z) {
            System.out.println("Y is greater");
        } else if (z>x && z>y) {
            System.out.println("Z is greater");
        }
        else {
            System.out.println("Numbers are equal");
        }
    }
}
public class Maximum_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter value of X: ");
        a=sc.nextInt();
        System.out.print("Enter value of Y: ");
        b=sc.nextInt();
        System.out.print("Enter value of Z: ");
        c=sc.nextInt();
        A obj=new A();
        obj.max(a,b,c);
    }
}
