import java.util.Scanner;

public class frequencyArray {
    static int[] makeFreqArray(int arr[],int n){
        int freq[] = new int[100005];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n= sc.nextInt();
        int arr[] = new int[n];
       

        System.out.println("Enter " + n +" elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int freq[]= makeFreqArray(arr, n);

        System.out.println("Enter mber of queries");
        int q=sc.nextInt();
        while(q-->0){
            System.out.println("ENter number to be checked");
            int k=sc.nextInt();
            if(freq[k]>0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            
    }
}
}
