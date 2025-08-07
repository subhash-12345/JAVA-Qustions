// Q.9 --> create a class circle with a method to calculate circumference.

import java.util.Scanner;

class Circle{
    float circumference(int r){
        return 2*3.14f*r;
        //  2 *PI *r=2*3.14*r
    }
}
public class Circumference_of_circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of radius: ");
        int r=sc.nextInt();
        Circle cr=new Circle();
        System.out.println("Circumference of Given circle is: "+cr.circumference(r));
    }
    
}
