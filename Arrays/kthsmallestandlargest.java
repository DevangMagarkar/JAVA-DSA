import java.util.Arrays;

public class kthsmallestandlargest {
    static int[] kthSmallestAndkthLargest(int arr[],int k){
        Arrays.sort(arr);
        int ans[]={arr[k-1],arr[arr.length-k]};
        return ans;
    }
    public static void main(String[] args) {
        int arr[] ={6,3,7,8,2,9,44,21,0};
        int ans[]= kthSmallestAndkthLargest(arr,4);
        System.out.println("kth smallest element is "+ans[0]);
        System.out.println("kth largest element is "+ans[1]);
    }
}
