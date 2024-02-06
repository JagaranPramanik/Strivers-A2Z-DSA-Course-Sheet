import java.util.Scanner;

public class IfElseDecisionMaking {
    public static String compareIfElse(int a, int b) {
        if(a > b) {
            return "greater";
        }
        else if(a < b) {
            return "smaller";
        }
        else {
            return "equal";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println(compareIfElse(num1, num2));
        sc.close();
    }
}