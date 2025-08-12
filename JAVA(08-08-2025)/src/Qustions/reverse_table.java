package Qustions;
import java.util.Scanner;
public class reverse_table {
// Print Revese table
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t;
        System.out.print("Enter Number that reverse table you want to print: ");
        t= sc.nextInt();
        int n=10;
        while(n>=1){
            System.out.println(n*t);
            n--;
        }
    }
}
