package Qustion_next;
// Using method write program of even and odd

import java.util.Scanner;

class Check{
   void check(int a){
        if (a%2==0){
            System.out.println("Given Number is Even");
        }
        else {
            System.out.println("Given Number is Odd");
        }
    }
}
public class Even_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number that you want to check: ");
        int a= sc.nextInt();
        Check c=new Check();
        c.check(a);
    }

}
