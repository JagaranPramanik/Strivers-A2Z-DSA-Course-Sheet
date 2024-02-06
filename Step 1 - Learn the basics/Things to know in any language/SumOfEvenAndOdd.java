import java.util.Scanner;

public class SumOfEvenAndOdd {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int evenSum = 0;
		int oddSum = 0;
		while(num > 0) {
			int remainder = num % 10;
			if(remainder % 2 == 0) {
				evenSum += remainder;
			}
			else {
				oddSum += remainder;
			}
			num /= 10;
		}
		System.out.println(evenSum + " " + oddSum);
		sc.close();
	}
	
}
