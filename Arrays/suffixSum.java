public class suffixSum {
    static int[] suffixSum(int arr[]){
        int n=arr.length;
        int suffixSum[]= new int[n];
        suffixSum[n-1]=arr[n-1];
        for(int i=2;i<=n;i++){
            suffixSum[n-i]=arr[n-i]+suffixSum[n-i+1];
        }
        // for(int i=n-2;i>=0;i--){
            // suffixSum[i]=arr[i]+suffixSum[i+1];
        // }
        return suffixSum;
    }
    static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int suffixSum[] = suffixSum(arr);
        print(suffixSum);
    }
}
