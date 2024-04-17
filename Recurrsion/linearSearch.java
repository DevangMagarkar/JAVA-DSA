public class linearSearch {
    static boolean search(int a[],int target,int n,int idx){
        ///base case
        if(idx>= n){
            return false;
        }
        
        if(a[idx]==target) return true;

        if(search(a, target, n, idx+1)){
            return true;
        }
        else{
            return false;
        }
 
        // OR return search(a, target, n, idx+1);
    }
    public static void main(String[] args) {
        int a[]={1,2,4,6};
        int target=8;
        int n=a.length;
        if(search(a, target, n, 0)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    
}
