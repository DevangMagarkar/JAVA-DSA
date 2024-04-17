public class lastIdxSearch5 {
    static int search(int a[],int target,int n,int idx){
        ///base case
        if(idx>= n){
            return -1;
        }
       
        int ans=search(a, target, n, idx+1); 
        if(ans==-1 && a[idx]==target) ans=idx;

        return ans;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,5,6,7};
        int target=4;
        int n=a.length;
        int ans=search(a, target, n, 0);
        System.out.println(ans);
    }
    
}
