package Qustion_next;

import java.util.Scanner;

// swap 2 number withoout using third variable
class Swap{
    void swap(int a,int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After Swap");
        System.out.println("A: "+a);
        System.out.print("B: "+b);
    }
}
public class Swap_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.print("Enter value of A:");
        a= sc.nextInt();
        System.out.print("Enter value of B:");
        b= sc.nextInt();
        Swap s=new Swap();
        s.swap(a,b);

    }
}
