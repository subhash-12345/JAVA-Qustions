package Qustions;

import java.util.Scanner;

public class Natural_number {
//    print all natural number from 1 to N
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter Value of N: ");
        n= sc.nextInt();
        for (int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}
