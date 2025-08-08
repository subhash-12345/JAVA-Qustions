package Qustion_next;

import java.util.Scanner;

// cube of square
class Cube{
    void cube(int a){
        System.out.println("Cube of square is: "+a*a*a);
    }
}

public class Cube_of_square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter side of square: ");
        int a= sc.nextInt();
        Cube c=new Cube();
        c.cube(a);
    }
}
