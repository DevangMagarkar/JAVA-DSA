public class checkPallindromenew {
 static boolean  reverseString(String s,int l,int r){
        if(l>=r){
            return;
        }
        reverseString(s,l+1,r+1);
        if

        return 


    }
    public static void main(String[] args) {
        String s = "dadad";
        int l=0;
        int r=s.length()-1;
        String rev = reverseString(s,l,r);
        
    }
}
