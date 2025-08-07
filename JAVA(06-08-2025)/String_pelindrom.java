// Q.12 --> Check given string is pelindrom or not.

import java.util.Scanner;

public class String_pelindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name;
        String temp="";
        System.out.print("Enter name: ");
        name=sc.nextLine();
        String p=name;
        for(int i=name.length()-1;i>=0;i--){
            temp+=name.charAt(i);
        }
      if (!name.equals(temp)) {
            System.out.println("Given String is not Pelindrom");
        } else {
            System.out.println("Given String is Pelindrom");
        }


    }
    
}
