import java.util.Scanner;

public class CheckArmstrong {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(isArmstrong(num));
		sc.close();
	}

	public static boolean isArmstrong(int n) {
		int temp = n;
		int k = 0;
		int digits = (int) Math.log10(n) + 1;
		while(n > 0) {
			int lasDigit = n % 10;
			k += Math.pow(lasDigit, digits);
			n /= 10;
		}
		return (k == temp);
	}
}
