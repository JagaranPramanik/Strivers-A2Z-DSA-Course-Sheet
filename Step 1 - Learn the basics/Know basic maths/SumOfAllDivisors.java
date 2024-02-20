import java.util.Scanner;

public class SumOfAllDivisors {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(sumOfAllDivisors(num));
		sc.close();
	}

    public static int sumOfAllDivisors(int n){
        int result = 0;
        for(int i=1; i<=n; i++) {
            for(int j=1; j*j<=i; j++) {
                if(i%j == 0) {
                    result += j;
                    if(i/j != j) {
                        result += i/j;
                    }
                }
            }
        }
        return result;
    }
}