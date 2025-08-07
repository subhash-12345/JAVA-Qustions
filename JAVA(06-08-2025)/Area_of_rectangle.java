// Q.8  -->  Create a class rectangle with length and breath. Use a method to find and return area.

import java.util.Scanner;
class rectangle{
    int Area(int length,int breath){
        return length*breath;
    }
}
public class Area_of_rectangle {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int length,breath;
     System.out.print("Enter value of length: ");   
     length=sc.nextInt();
     System.out.print("Enter value of breath: ");   
     breath=sc.nextInt();
   rectangle r=new rectangle();
   
     System.out.println("Are of rectangle: "+r.Area(length, breath));
     
    }
}
