public class secondLargest {
    static int findMax(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    static int findSecondLargest(int arr[]){
        int mx=findMax(arr);
        for(int i=0;i<arr.length;i++){
            if(mx==arr[i]){
                arr[i]=Integer.MIN_VALUE;
            }
        }

        return findMax(arr);
    }
    public static void main(String[] args) {
        int arr[] = {7,2,2,4,9,9,1,2,9,5};
        System.out.println(findSecondLargest(arr));
    }
    
}
