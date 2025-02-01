import java.util.Stack;

public class Area {
    static int[] findPreviousSmaller(int[] arr)
    {
        int[] brr=new int[arr.length];
        Stack <Integer> s = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(i==0){
                brr[i]=-1;
                s.push(i);
            }

             else if(arr[s.peek()]<arr[i])
            {
                brr[i]=s.peek();
                s.push(i);
            }
        
            else if(arr[s.peek()]>arr[i])
            {
                while( s.size()!=0 && arr[s.peek()]>arr[i]){
                    s.pop();
                    }
                    if(s.size()==0){
                        brr[i]=-1;
                        s.push(i);
                    }
                    else{
                        brr[i]=s.peek();
                        s.push(i);
                    }
                  
                    
                }
            }
            return brr;
        }
        static int [] findNextSmaller(int[] arr )
    {
        Stack<Integer> s = new Stack<>();
        int[] brr = new int[arr.length];
         for(int i=arr.length-1;i>-1;i--)
         {
            if(i==arr.length-1)
            {
                brr[i]=-1;
                s.push(i);
            }

            else if(arr[s.peek()]<arr[i])
            {
                brr[i]=s.peek();
                s.push(i);
            }

            else if (arr[s.peek()]>arr[i])
            {
                while(arr[s.peek()]>arr[i])
                {
                    s.pop();
                    if(s.size()==0)
                    {
                        brr[i]=-1;
                        s.push(i);
                    }
                    else{
                            brr[i]=s.peek();
                            
                    }

                }
                s.push(i);
            }

         }
         return brr;
    } 
        public static void main(String[] args) {
            int[] arr = { 1,2,3,4,5,6,7,8};
            arr=findPreviousSmaller(arr);
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            int [] brr = { 9,1,8,2,7,3,6};
            arr=brr;
            System.out.println();
            arr=findNextSmaller(arr);
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
}
