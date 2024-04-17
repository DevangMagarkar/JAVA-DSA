import java.util.ArrayList;

public class linearSearch4 {
    static ArrayList<Integer> search(int a[],int target,int n,int idx){
       ArrayList<Integer> arr= new ArrayList<>(); 
        ///base case
        if(idx>= n){
             
            return new ArrayList<Integer>(); 
        }
        
        if(a[idx]==target) {
           arr.add(idx);
        };

        
        ArrayList<Integer> smallAns= search(a, target, n, idx+1);
        arr.addAll(smallAns);
        return arr;
    }
    public static void main(String[] args) {
        int a[]={1,2,4,7,3,4,2,4,2,4};
        int target=4;
        int n=a.length;
        ArrayList<Integer> ans= search(a, target, n, 0);
        for (Integer i : ans) {
            System.out.print(i + " ");
        }
    }
    
}