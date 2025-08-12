<<<<<<< HEAD
package Qustions;

import java.util.Scanner;

public class Sum_Of_digit {
    // Sum of digits
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n=sc.nextInt();
        int s=0;
        while (n!=0) {
            int rem=n%10;
            s=s+rem;
            n=n/10;
        }
        System.out.println("Sum of digit are: "+s);
    }
}
=======
package Qustions;

import java.util.Scanner;

public class Sum_Of_digit {
    // Sum of digits
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n=sc.nextInt();
        int s=0;
        while (n!=0) {
            int rem=n%10;
            s=s+rem;
            n=n/10;
        }
        System.out.println("Sum of digit are: "+s);
    }
}
>>>>>>> ae9c59b9a50f8c6013f05eb2e4f906350a81b633
