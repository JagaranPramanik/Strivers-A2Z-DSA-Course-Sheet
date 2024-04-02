import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of the array: ");
        int n = sc.nextInt();  
        int[] arr = new int[n];  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++) {   
        arr[i] = sc.nextInt();  
        }
        bubbleSort(arr, arr.length);
        System.out.println("Sorted Array: ");  
        for (int i=0; i<n; i++) {  
        System.out.print(arr[i] + " ");  
        }
        sc.close();
    }

    public static void bubbleSort(int[] arr, int n) {
        for(int i=n-1; i>=0; i--) {
            boolean flag = false;
            for(int j=0; j<=i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    // swapping
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }
            }
            if(! flag) {
                break;
            }
        }
    }
}
