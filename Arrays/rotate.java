import java.util.Scanner;

public class rotate {
    static int[] rotate(int arr[],int k,int n){
        k=k%n;
        int ans[]=new int[n];
        int j=0;
        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }

        for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }

        return ans;
    }

    static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter elements of array");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter value of k");
        int k = sc.nextInt();
        int ans[]=rotate(arr, k, n);
        print(ans);
        
        
    }
    
}
