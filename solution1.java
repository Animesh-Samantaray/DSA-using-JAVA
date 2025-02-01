
public class solution1 {

        public static  int singleNumber(int[] arr) {
           
            int n=arr.length;
            for(int i=0;i<n-1;i++){
                int s =0;
                for(int j=i+1;j<n;j++)
                {
                    if(arr[j]==arr[i]){
                        s++; 
                    }
                }
                if(s==0) return arr[i];
            }
        
            return 0;
        }
        public static void main(String ar[])
        {

           // ArrayList<Integer> a=new ArrayList<>();

            
            int arr[]={2,2,3,4,5,5,4,3,0};
            System.out.println(singleNumber(arr));
        }
    
}
