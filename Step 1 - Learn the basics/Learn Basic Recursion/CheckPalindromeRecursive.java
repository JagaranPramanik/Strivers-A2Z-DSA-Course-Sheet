import java.util.Scanner;

public class CheckPalindromeRecursive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isPalindrome(str, 0));
        sc.close();
    }

    public static boolean isPalindrome(String str, int i) {
        if(i >= str.length()/2) {
            return true;
        }
        if(str.charAt(i) != str.charAt(str.length()-1-i)) {
            return false;
        }
        return isPalindrome(str, i+1);
    }
}
