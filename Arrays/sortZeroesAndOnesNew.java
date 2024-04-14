public class sortZeroesAndOnesNew{
    static void swap(int arr[],int left,int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    static int[] sortZeroesAndOnesNew(int arr[]){
        int left=0;
        int right=arr.length-1;
        while(left<right){
          if(arr[left]==1 && arr[right]==0){
            swap(arr, left, right);
            left++;
            right--;
          }
          if(arr[left]==0){
            left++;
          }
          if(arr[right]==1){
            right--;
          }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={0,1,1,0,0,0,1,0,1,1};
        int ans[]=sortZeroesAndOnesNew(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+ " ");
        }
    }
    }
