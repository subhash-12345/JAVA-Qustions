<<<<<<< HEAD
package Qustions;

import java.util.Scanner;

public class Reverse_number {
    // Revers the given number
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number that you want to reverse: ");
        int n=sc.nextInt();
        int rev=0;
        while (n!=0) {
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println("Sum of digit are: "+rev);
    }
}
=======
package Qustions;

import java.util.Scanner;

public class Reverse_number {
    // Revers the given number
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number that you want to reverse: ");
        int n=sc.nextInt();
        int rev=0;
        while (n!=0) {
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println("Sum of digit are: "+rev);
    }
}
>>>>>>> ae9c59b9a50f8c6013f05eb2e4f906350a81b633
