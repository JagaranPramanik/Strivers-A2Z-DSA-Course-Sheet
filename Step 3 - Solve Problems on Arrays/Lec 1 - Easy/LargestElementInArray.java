import java.util.Scanner;

public class LargestElementInArray {
    static int largestElement(int[] arr, int n) {
        int result = arr[0];
        for(int i=0; i<n; i++) {
            if(arr[i] > result) {
                result = arr[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of the array: ");
        int n = sc.nextInt();  
        int[] arr = new int[n];  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++) {   
        arr[i] = sc.nextInt();  
        }
        System.out.println("Largest element in the array: " + largestElement(arr, n));
        sc.close();
    }
}