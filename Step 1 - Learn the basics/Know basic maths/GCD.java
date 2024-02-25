import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
		System.out.println(calcGCD(a, b));
		sc.close();
	}

    // solved using Euclidean algorithm
    public static int calcGCD(int n, int m){
        while(n>0 && m>0) {
            if(n>m) n = n%m;
            else m = m%n;
        }
        if(n==0) return m;
        return n;
    }
}