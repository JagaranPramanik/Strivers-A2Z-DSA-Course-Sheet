import java.util.Scanner;

public class CheckSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of the array: ");
        int n = sc.nextInt();  
        int[] arr = new int[n];  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++) {   
        arr[i] = sc.nextInt();  
        }
        System.out.println(isSorted(n, arr));
        sc.close();
    }

    public static int isSorted(int n, int []a) {
        for(int i=1; i<n; i++) {
            if(a[i] < a[i-1]) {
                return 0;
            }
        }
        return 1;
    }
}