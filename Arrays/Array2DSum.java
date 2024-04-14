import java.util.Scanner;

public class Array2DSum {
    static void printArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns");
        int r1= sc.nextInt();
        int c1= sc.nextInt();
        System.out.println("Enter " + r1*c1 + " elements");
        int arr[][] = new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        printArray(arr);
    }
}
