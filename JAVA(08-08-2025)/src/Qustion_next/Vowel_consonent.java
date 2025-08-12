package Qustion_next;

import java.util.Scanner;
class CH{
    void Ch(String ch){
        switch (ch){
            case "A","E","I","O","U" :
                System.out.println("Given Character is Vowel");
                break;
            case "a","e","i","o","u" :
                System.out.println("Given Character is Vowel");
                break;
            default:
                System.out.println("Given Character is Consonent");
        }

    }
}

public class Vowel_consonent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Character: ");
        String ch= sc.nextLine();
        CH CC=new CH();
        CC.Ch(ch);

    }
}
