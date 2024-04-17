public class linearSearch2 {
    static int search(int a[],int target,int n,int idx){
        ///base case
        if(idx>= n){
            return -1;
        }
        
        if(a[idx]==target) return idx;

        
        return search(a, target, n, idx+1);
    }
    public static void main(String[] args) {
        int a[]={1,2,4,6};
        int target=4;
        int n=a.length;
        int ans=search(a, target, n, 0);
        System.out.println(ans);
    }
    
}
