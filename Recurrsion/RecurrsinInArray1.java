public class RecurrsinInArray1 {
    static void printArray(int arr[],int idx,int n){
        if(idx==n){
            return;
        }

        System.out.print(arr[idx]+ " ");
        printArray(arr, idx+1, n);
        
    }
    public static void main(String[] args) {
        int arr[]={5,6,7,8};
        int idx=0;
        int n=arr.length;
        printArray(arr, idx, n);
    }
}
