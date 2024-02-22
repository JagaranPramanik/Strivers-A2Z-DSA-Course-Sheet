import java.util.Scanner;

public class CheckPrime {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(isPrime(num));
		sc.close();
	}

	public static String isPrime(int num) {
		if(num <= 1) {
			return "NO";
		}
		int count = 0;
		for(int i=2; i*i<=num; i++) {
			if(num%i == 0) {
				count++;
			}
		}
		if(count == 0) {
			return "YES";
		}
		return "NO";
	}
}