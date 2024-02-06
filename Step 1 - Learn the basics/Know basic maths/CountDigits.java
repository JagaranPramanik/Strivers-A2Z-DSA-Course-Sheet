import java.util.Scanner;

public class CountDigits {
    public static int countDigits(int n){
        int num = n;
        int count = 0;
        while(num > 0) {
            int temp = num % 10;
            if(temp > 0 && n % temp == 0) {
                count++;
            }
            num /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(countDigits(num));
        sc.close();
    }
}