

import java.util.Scanner;



public class takingInput {
    public static void printArr(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter values");

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        printArr(arr,n);
    }
}
