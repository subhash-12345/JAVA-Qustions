// Q.6  -->  Write a program to display the gread of student based on marks using if else ladder.

import java.util.Scanner;

public class Student_grad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks;
        System.out.print("Enter marks (1-100): ");
        marks=sc.nextInt();
        if (marks>=91 && marks<=100) {
           System.out.println("Student grad is: S"); 
        }
         else if(marks>=81 && marks<=90){
            System.out.println("Student grad is: A+");
           }
           else if(marks>=71 && marks<=80){
            System.out.println("Student grad is: A");
           }
           else if (marks>=61 && marks<=70) {
            System.out.println("Student grad is: B+");
           }
           else if (marks>=51 && marks<=60) {
            System.out.println("Student grad is: B");
           }
           else if(marks>=41 && marks<=50){
            System.out.println("Student grad is: C");
           }
           else if (marks>=30 && marks<=40 ) {
            System.out.println("Student grad is: D");
           }
           else if (marks>100) {
            System.out.println("Please enter Marks only(1-100)");
           }
           else{
            System.out.println("Student grad is: F");
           }
        
    }
    
}
 