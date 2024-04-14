public class prefixSumUsingNewArray {
    static int[] prefixSumCalculate(int arr[]){
        int n = arr.length;
        int prefix[]= new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        return prefix;
    }
    static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int prefixArray[]= prefixSumCalculate(arr);
        print(prefixArray);
    }
    
}
