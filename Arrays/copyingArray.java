
import java.util.*;
public class copyingArray {
    public static void printArr(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter values");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int arr2[] = arr;
        int arr3[] = arr.clone();
        int arr4[] = Arrays.copyOf(arr, n);

        System.out.println("Original Array");
        printArr(arr, n);

        System.out.println("Copied Array");
        printArr(arr2, n);
        System.out.println("Copied Array");
        printArr(arr2, n);
        System.out.println("Copied Array");
        printArr(arr2, n);
    }
}
