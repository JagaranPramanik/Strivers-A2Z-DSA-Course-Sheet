import java.util.Scanner;

public class SecondOrderElement {
    // Get second largest element in the array
    public static int getSecondLargest(int n, int []a) {
        int largest = a[0];
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            if(a[i] < largest && a[i] > secondLargest) {
                secondLargest = a[i];
            }
            else if(a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
            }
        }
        return secondLargest;
    }

    // Get second smallest element in the array
    public static int getSecondSmallest(int n, int []a) {
        int smallest = a[0];
        int secondSmallest = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            if(a[i] > smallest && a[i] < secondSmallest) {
                secondSmallest = a[i];
            }
            else if(a[i] < smallest) {
                secondSmallest = smallest;
                smallest = a[i];
            }
        }
        return secondSmallest;
    }
    public static int[] getSecondOrderElements(int n, int []a) {
        int[] arr = new int[2];
        arr[0] = getSecondLargest(n, a);
        arr[1] = getSecondSmallest(n, a);
        return arr;
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
        System.out.println("Second largest and second smallest elements in the array respectively are: ");
        int[] secondOrder = getSecondOrderElements(n, arr);
        for(int i=0; i<secondOrder.length; i++) {   
            System.out.println(secondOrder[i]);
        }
        sc.close();
    }

}
