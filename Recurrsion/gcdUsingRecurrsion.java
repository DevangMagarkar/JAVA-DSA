import javax.naming.ldap.ManageReferralControl;

public class gcdUsingRecurrsion {
    static int gcd(int x,int y){
        if(y==0){
            return x;
        }
        return gcd(y,x%y);
    }
    public static void main(String[] args) {
        int x=24;
        int y=15;
        System.out.println(gcd(x, y));
    }
}
