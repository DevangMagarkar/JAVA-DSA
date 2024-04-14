public class lastOccurenceOfAnElement {
    public static int findLastOccurence(int arr[],int k){
        int idx=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                idx=i;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int arr[] ={ 7,2 ,2,4,9,9,1,2,9,5};
        int k=9;
        System.out.println( findLastOccurence(arr,k));
    }
}
