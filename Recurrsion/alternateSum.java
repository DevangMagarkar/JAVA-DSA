public class alternateSum {
    static int sum(int n){
        if(n==1){
            return 1;
        }

        int prev= sum(n-1);
        if(n%2==0){
            return -n + prev;
        }
        else{
            return n+prev;
        }
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(sum(n));
    }
    
}
