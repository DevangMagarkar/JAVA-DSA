public class printMultiplesOfNum {
    static void print(int n,int k){
        if(k==1){
            System.out.print(n + " ");
            return;
        }

        print(n, k-1);
        System.out.print(n*k +  " ");
    }
    public static void main(String[] args) {
        print(12, 5);
    }
}
