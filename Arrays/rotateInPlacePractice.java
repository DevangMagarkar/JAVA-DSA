public class rotateInPlacePractice{
    static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j-1];
        arr[j-1]=temp;
    }
    static void reverse(int arr[],int i,int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static void rotate(int arr[],int k,int n){
        k=k%n;
        reverse(arr,n-k,n);
        reverse(arr,0,n-k);
        reverse(arr,0,n);
    }
    static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +  " ");
        }System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int n=arr.length;
        rotate(arr,5,n);
        print(arr);
    }
}

