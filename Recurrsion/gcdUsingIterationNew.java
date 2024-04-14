public class gcdUsingIterationNew {
    static int gcd(int x,int y){
        while(x%y!=0){
            int r=x%y;
            x=y;
            y=r;

        }
        return y;
    }
    public static void main(String[] args) {
        int x=24;
        int y=15;
        System.out.println(gcd(x, y));
    }
    
}
