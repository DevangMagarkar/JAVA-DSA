import java.util.Scanner;
import java.util.function.ToDoubleBiFunction;
public class prefixSumQuestion {

    static int totalSum(int arr[]){
        int totalSum=0;
        for(int i=0;i<arr.length;i++){
            totalSum=totalSum+arr[i];
        }
        return totalSum;
    }
    static boolean equalSumPartition(int[] arr){
        int totalSum=totalSum(arr);
        int prefSum=0;
        for(int i=0;i<arr.length;i++){
            prefSum = prefSum+arr[i];
        
        int suffsUM = totalSum-prefSum;
        if(suffsUM==prefSum){
            return true;
        }
    }
      return false;  
    }

    static int[] prefixSumCalculate(int arr[]){
        int n = arr.length;
       
        
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr ;
    }
    static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of Array");
    int n= sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter values");

    for(int i=0 ; i<n ; i++){
        arr[i]= sc.nextInt();
    }
    System.out.println(equalSumPartition(arr));
    }
}
