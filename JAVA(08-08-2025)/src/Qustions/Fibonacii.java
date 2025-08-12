package Qustions;

import java.util.Scanner;

public class Fibonacii {
//  Print fibonacii series
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=-1;
    int b=1;
    int c;
    System.out.print("Enter a Range: ");
    int range=sc.nextInt();
    for(int i=1;i<=range;i++){
        c=a+b;
        System.out.print(c+" ");
        a=b;
        b=c;
    }
}
}
