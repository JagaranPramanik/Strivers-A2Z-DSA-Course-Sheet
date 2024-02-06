import java.util.Scanner;

public class FibonacciNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(fibo(num));
        sc.close();
	}

	public static int fibo(int n) {
        // for n = 1 and n = 2, fibo(n) = 1
		if(n <= 2) {
			return 1;
		}
		return fibo(n-1) + fibo(n-2);
	}

}
