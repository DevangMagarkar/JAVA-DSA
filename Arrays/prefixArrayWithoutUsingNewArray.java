public class prefixArrayWithoutUsingNewArray {
   
        static void prefixSumCalculate(int arr[]){
            int n = arr.length;
           
            arr[0]=arr[0];
            for(int i=1;i<n;i++){
                arr[i]=arr[i-1]+arr[i];
            }
            return ;
        }
        static void print(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i] + " ");
            }
        }
        public static void main(String[] args) {
            int arr[]={1,2,3,4,5,6};
            prefixSumCalculate(arr);
            print(arr);
        }
        
    }

