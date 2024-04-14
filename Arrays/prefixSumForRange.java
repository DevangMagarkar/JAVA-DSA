import java.util.*;
public class prefixSumForRange {
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
    int arr[] = new int[n+1];
    System.out.println("Enter values");

    for(int i=1;i<=n;i++){
        arr[i]= sc.nextInt();
    }
    int prefix[]= prefixSumCalculate(arr);
    System.out.println("Enter number of queries");
    int q= sc.nextInt();

    while(q-->0){
        System.out.println("Enter range");
        int l=sc.nextInt();
        int r=sc.nextInt();
   
    
   
     int ans= prefix[r]-prefix[l-1];
     System.out.println("ans is " + ans);
    }
   } 
}
