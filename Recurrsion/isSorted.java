public class isSorted {
    static boolean isSorted(int[] arr, int i){
        if(i==arr.length-1)
            return true;
        if(arr[i] > arr[i+1])
            return false;
        else
            return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,3};
        int n=arr.length;
        System.out.println(isSorted(arr,0));
    }
    
}
