package Qustion_next;
// Print factorial using method

import java.util.Scanner;

class Fact{
    void fact(int a){
        int mul=1;
        for (int i=1;i<=a;i++){
            mul=mul*i;
        }
        if (a==0 || a==1){
            System.out.println(1);
        }
        else {
            System.out.println(mul);
        }
    }
}
public class Factorial_using_method {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number that factorial you want: ");
        int a= sc.nextInt();
        Fact f=new Fact();
        f.fact(a);
    }
}
