// // Q.10 --> write a programm to Check given number is pelindrom or not.

import java.util.Scanner;

public class Number_pelindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number that you want to check: ");
    int num=sc.nextInt();
    String str=""+num;
    String s="";
    for(int i=str.length()-1;i>=0;i--){
        s=s+str.charAt(i);
    }
    int nump=Integer.valueOf(s);
    if(nump==num){
        System.out.println("Given number is pelindrom number");
    }
    else{
        System.out.println("Given number is not a pelindrom number");
    }
 
        
    }
    
}
