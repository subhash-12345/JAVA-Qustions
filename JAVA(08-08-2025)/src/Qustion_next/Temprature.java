<<<<<<< HEAD
package Qustion_next;
import java.util.Scanner;

class F{
    void met(int celcious){
        int fer=(celcious*9/5)+32;
        System.out.println("Temprature in ferignheight: "+fer);
    }
}
public class Temprature {
    public static void main(String[] args) {
        // °F = (°C × 9/5) + 32
        F f=new F();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter temprature in celcious: ");
        int celcious=sc.nextInt();
        f.met(celcious);
    }
}
=======
package Qustion_next;
import java.util.Scanner;

class F{
    void met(int celcious){
        int fer=(celcious*9/5)+32;
        System.out.println("Temprature in ferignheight: "+fer);
    }
}
public class Temprature {
    public static void main(String[] args) {
        // °F = (°C × 9/5) + 32
        F f=new F();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter temprature in celcious: ");
        int celcious=sc.nextInt();
        f.met(celcious);
    }
}
>>>>>>> ae9c59b9a50f8c6013f05eb2e4f906350a81b633
