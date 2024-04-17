public class linearSearch3 {
    static void search(int a[],int target,int n,int idx){
        ///base case
        if(idx>= n){
             
            return;
        }
        
        if(a[idx]==target) {
            System.out.print(idx + " ");
        };

        
        search(a, target, n, idx+1);
    }
    public static void main(String[] args) {
        int a[]={1,2,4,7,3,4,2,4,2,4};
        int target=4;
        int n=a.length;
        search(a, target, n, 0);
        
    }
    
}