public class lastRepeating {
    static int repeatingValue(int arr[]){
        int rep=-1;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    rep=arr[i];
                }
            }
        }
        return rep;
    }
    public static void main(String[] args) {
        int arr[]= {1,5,3,4,6,3,4};
        System.out.println("the last repeated value is "+ repeatingValue(arr));
    }
    
}
