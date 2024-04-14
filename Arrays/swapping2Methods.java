public class swapping2Methods {
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);

        }


        static void swap2(int a,int b){
            a=a+b;
            b=a-b;
            a=a-b;
            System.out.println(a);
            System.out.println(b);
    
        }
    public static void main(String[] args) {
        int a=10;
        int b=5;
        
        swap2(a, b);
        swap(a, b);
       
    }
    
}
