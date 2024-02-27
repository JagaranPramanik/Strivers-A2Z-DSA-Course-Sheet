import java.util.Scanner;

public class SumOfFirstNNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        System.out.println(sumFirstN(num));
        sc.close();
    }

    public static long sumFirstN(long n) {
        if(n == 1) {
            return 1;
        }
        return n + sumFirstN(n-1);
    }
}