public class nonDecreasingOrder {
   
    static int[] sortElement(int arr[]){
        int n=arr.length;
        int left=0;
        int right=n-1;
        int ans[]= new int[n];
        int j=0;
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                arr[j++]=arr[left]*arr[left];
                left++;
            }
            if(Math.abs(arr[left])<Math.abs(arr[right])){
                
                arr[j++]=arr[right]*arr[right];
                right--;
            }
            if(Math.abs(arr[left])==Math.abs(arr[right])){
                
                arr[j++]=arr[right]*arr[right];
                right--;
                arr[j++]=arr[left]*arr[left];
                
                left++;
            }
        }
      return ans;
    }
    public static void main(String[] args) {
        int arr[]={-10,-3,-2,1,4,5};
        int ans[]=sortElement(arr);
    
    for(int i=0;i<ans.length;i++){
        System.out.print(ans[i]+ " ");
    }
}
}
