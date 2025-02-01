
import java.util.Scanner;
import java.util.Stack;

public class congicutiveSubSequencs {
    static void sequence(int[] arr){
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<arr.length ;i++){
            if(i==0 || s.peek()!=arr[i]) 
            s.push(arr[i]);

            else if(s.peek() == arr[i])
            {
                if(arr[i]!=arr[i+1]){
                    s.pop();
                }
            }
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = { 1,2,2,3,4,4,5,6,7,7,8,8,9,10,11,11,12};
        sequence(arr);
    }
}
