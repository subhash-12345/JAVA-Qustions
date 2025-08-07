// Q.10 --> write a programm to print the multiplication tablee of any number using a for loop.

import java.util.Scanner;

public class Table_print {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number that table you want: ");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num*i);
        }
    }
    
}
