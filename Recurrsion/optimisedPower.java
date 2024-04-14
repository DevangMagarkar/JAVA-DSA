public class optimisedPower {
    static int pow(int p,int q){
        if(q==0){
            return 1;
        }
        int smallpow=pow(p,q/2);
        if(q%2==0){
            
            return smallpow*smallpow;
        }
        else{
            
            return p*smallpow*smallpow;
        }
    }
 public static void main(String[] args) {
    int p=5;
    int q=6;
    System.out.println(pow(p,q));
 }   
}
