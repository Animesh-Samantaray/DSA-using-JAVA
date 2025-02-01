
import java.util.Stack;

public class previousSmaller_Using_Stack {
   
    static int[] findPreviousSmaller(int[] arr)
    {
        int[] brr=new int[arr.length];
        Stack <Integer> s = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(i==0){
                brr[i]=-1;
                s.push(arr[i]);
            }

             else if(s.peek()<arr[i])
            {
                brr[i]=s.peek();
                s.push(arr[i]);
            }
        
            else if(s.peek()>arr[i])
            {
                while( s.size()!=0 && s.peek()>arr[i]){
                    s.pop();
                    }
                    if(s.size()==0){
                        brr[i]=-1;
                        s.push(arr[i]);
                    }
                    else{
                        brr[i]=s.peek();
                        s.push(arr[i]);
                    }
                  
                    
                }
            }
            return brr;

        }    
    public static void main(String[] args) {
        int [] arr={1,2,9,8,3,11,4};
        arr=findPreviousSmaller(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
