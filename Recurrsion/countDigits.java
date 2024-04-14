public class countDigits{
    static int count(int n){
        //base case
        if(n>=0 && n<=9){
            return 1;
        }
        //sub problem
        int count = count(n/10);
        //selfwork
        return count+1;
    }
    public static void main(String[] args) {
        int n=534;
        System.out.println(count(n));
    }
}