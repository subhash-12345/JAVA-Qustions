package Qustions;

import java.util.Scanner;

public class table {
    // Print table
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Nuber which table you want to print: ");
        int t= sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(i*t);
        }
    }
}
