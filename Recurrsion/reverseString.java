public class reverseString {
    static String reverseString(String s,int idx){
        if(idx==s.length()){
            return " ";
        }

        return reverseString(s, idx+1) + s.charAt(idx);


    }
    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(reverseString(s,0));
    }
}
