import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isPalindrome(n));
        sc.close();
	}

	public static boolean isPalindrome(int num) {
		int temp = num;
		int reverseNum = 0;
		while(num > 0) {
            int lastDigit = num % 10;
			reverseNum = reverseNum * 10 + lastDigit;
			num /= 10;
		}
		if(reverseNum == temp) {
			return true;
		}
		return false;
	}
}