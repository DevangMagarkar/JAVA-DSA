public class gcdUsingIteration {
    static int gcd(int n1,int n2){
        int min=Math.min(n1, n2);
        for(int i=min;i>0;i--){
            if(n1%i==0 && n2%i==0){
                return i;
                
            }
            
                
            
        }
        return 1;
    }
    public static void main(String[] args) {
        int n1=4;
        int n2=9;
        System.out.println(gcd(n1, n2));
    }
    
}
