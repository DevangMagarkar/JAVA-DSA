public class checkPallindrome {
    static String reverseString(String s,int idx){
        if(idx==s.length()){
            return "";
        }

        return reverseString(s, idx+1) + s.charAt(idx);


    }
    public static void main(String[] args) {
        String s = "dada";
        String rev = reverseString(s,0);
        if(rev.equals(s)){
            System.out.println("String is Pallindrome");
        }
        else{
           System.out.println("it is not");
        }
        
    }
}
