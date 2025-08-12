<<<<<<< HEAD
package Qustion_next;

import java.util.Scanner;

// Write a method that takes two numbers as parameters and returns their sum
class addition{
    int sum(int a,int b){
//        System.out.println(a+b);
        return a+b;
    }
}
public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.print("Plaese enter value of x: ");
        x=sc.nextInt();

        System.out.print("Plaese enter value of y: ");
        y= sc.nextInt();
        addition add=new addition();
        add.sum(x,y);

    }
}
=======
package Qustion_next;

import java.util.Scanner;

// Write a method that takes two numbers as parameters and returns their sum
class addition{
    int sum(int a,int b){
//        System.out.println(a+b);
        return a+b;
    }
}
public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.print("Plaese enter value of x: ");
        x=sc.nextInt();

        System.out.print("Plaese enter value of y: ");
        y= sc.nextInt();
        addition add=new addition();
        add.sum(x,y);

    }
}
>>>>>>> ae9c59b9a50f8c6013f05eb2e4f906350a81b633
