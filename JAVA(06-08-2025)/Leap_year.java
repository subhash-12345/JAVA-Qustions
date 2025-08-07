// Q.7 -->  write a program to check if a year is leap year or not using conditional statement.

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year;
        System.out.print("Enter year:");
        year=sc.nextInt();
        if (year%4==0 || year%100==0) {
            System.out.println("Given year is leap year");
        }
        else{
            System.out.println("GIven year is not a leap year");
        }
    }
    
}
