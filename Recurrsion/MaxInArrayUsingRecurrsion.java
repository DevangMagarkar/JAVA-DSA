public class MaxInArrayUsingRecurrsion {
    static int max(int arr[],int idx){

        if(idx== arr.length-1){
            return arr[idx];
        }
        return Math.max(arr[idx], max(arr, idx+1));
    }
    public static void main(String[] args) {
        int arr[]={5,6,8,3,7};
        
        System.out.println(max(arr, 0));
    }
    
}
