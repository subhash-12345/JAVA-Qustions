import java.util.Scanner;

class Addition {
    int sum(int a, int b) {
        return a + b;
    }
}

class subtraction {
    int sub(int a, int b) {
        return a - b;
    }
}

class Multiplication {
    int mul(int a, int b) {
        return a * b;
    }
}

class Division {
    int div(int a, int b) {
        return a / b;
    }
}

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of A: ");
        int a = sc.nextInt();
        System.out.print("Enter value of B: ");
        int b = sc.nextInt();
        char op;
        System.out.print("Enter operation (w=add, x=subtract, y=multiply, z=divide): ");
        op = sc.next().charAt(0);

        Addition add = new Addition();
        subtraction sub = new subtraction();
        Multiplication mul = new Multiplication();
        Division div = new Division();

        switch (op) {
            case 'w':
                System.out.println("Result: " + add.sum(a, b));
                break;
            case 'x':
                System.out.println("Result: " + sub.sub(a, b));
                break;
            case 'y':
                System.out.println("Result: " + mul.mul(a, b));
                break;
            case 'z':
                if (b != 0) {
                    System.out.println("Result: " + div.div(a, b));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation selected.");
        }

    }
}