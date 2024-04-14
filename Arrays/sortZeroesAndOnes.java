public class sortZeroesAndOnes {
    static int[] sortZeroesAndOnes(int arr[]){
        
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
           
        }
        for(int i=0;i<arr.length;i++){
            if(i<count){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={0,1,1,0,0,0,1,0,1,1};
        int ans[]=sortZeroesAndOnes(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+ " ");
        }
    }
}
