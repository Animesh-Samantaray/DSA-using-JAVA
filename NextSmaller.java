
import java.util.Stack;

public class NextSmaller {
    static int [] findNextSmaller(int[] arr )
    {
        Stack<Integer> s = new Stack<>();
        int[] brr = new int[arr.length];
         for(int i=arr.length-1;i>-1;i--)
         {
            // if(i==arr.length-1)
            // {
            //     brr[i]=-1;
            //     s.push(arr[i]);
            // }

            // else if(s.peek()<arr[i])
            // {
            //     brr[i]=s.peek();
            //     s.push(arr[i]);
            // }

            // else if (s.peek()>arr[i])
            // {
            //     while(s.peek()>arr[i])
            //     {
            //         s.pop();
            //         if(s.size()==0)
            //         {
            //             brr[i]=-1;
            //             s.push(arr[i]);
            //         }
            //         // else{
            //         //         brr[i]=s.peek();
            //         //         s.push(arr[i]);
            //         // }
            //     }
            // }
            brr[i]=-1;
            if(s.isEmpty()){
                s.push(arr[i]);
            }
            else if(s.peek()<=arr[i]){
                brr[i]=s.peek();
                s.push(arr[i]);
            }
            else if(s.peek()>arr[i]){
                while(!s.isEmpty()){
                    s.pop();
                    if(s.size()==0){
                        brr[i]=-1;
                    }
                    else{
                        if(s.peek()<arr[i]){
                            brr[i]=s.peek();
                            s.push(arr[i]);
                        }
                    }
                }
            }
         }
         return brr;
    }
    public static void main(String[] args) {
        int arr[] = { 4,3,2,1,0};
        int[] brr=findNextSmaller(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(brr[i]+" ");
        }
    }
}
