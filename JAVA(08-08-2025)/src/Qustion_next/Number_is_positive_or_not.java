<<<<<<< HEAD
package Qustion_next;

import java.util.Scanner;

class P{
    P(float num){
        if (num<0){
            System.out.println("Given number is Negative");
        }
        else if (num>0){
            System.out.println("Given number is Positive");
        }
        else {
            System.out.println("Given number is Zero");
        }
    }
}
public class Number_is_positive_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number that you want to check: ");
        float num=sc.nextFloat();
        new P(num);
    }
}
=======
package Qustion_next;

import java.util.Scanner;

class P{
    P(float num){
        if (num<0){
            System.out.println("Given number is Negative");
        }
        else if (num>0){
            System.out.println("Given number is Positive");
        }
        else {
            System.out.println("Given number is Zero");
        }
    }
}
public class Number_is_positive_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number that you want to check: ");
        float num=sc.nextFloat();
        new P(num);
    }
}
>>>>>>> ae9c59b9a50f8c6013f05eb2e4f906350a81b633
