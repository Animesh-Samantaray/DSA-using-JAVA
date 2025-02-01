import java.util.Scanner;
public class usingArrays {
   static  class Stack{
        int len;
        int k=-1;
        int[] arr;
       Stack(int le){
        arr=new int[le];
        len = le;
       }
        boolean isFull(){
            if(k==len-1)
            return true; 
             else return false;
        }
        boolean isEmpty(){
            if(k==-1)
            return true ;
            else 
            return false;
        }
         void push(int data){
            if(isFull())
            System.out.println(" | Stack Overflow |");
            else{
                k++;
                arr[k]=data;
            }
         }

         void pop(){
            if(isEmpty())
            System.out.println(" -- Stack Underflow --");
            else
            {
             arr[k]=0;
             k--;   
            }
         }
         
         void displayStack(){
            if(isEmpty())
            System.out.println(" No elements are available in the stack");
            else 
            {
                for(int i=0;i<=k;i++)
                System.out.print(arr[i]+" ");
            }
            System.out.println();
         } 
         int peek(){
            if(isEmpty()){ 
            System.out.println(" No elements are available in the stack");
            return Integer.MIN_VALUE;
            }

            else 
            return arr[k];
         }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the stack size : ");
        int len = sc.nextInt();
        Stack s = new Stack(len);
         int y ;
         while(true) { 
      System.out.println("1)push\n2)pop\n3)peek\n4)display\n5)exit");
      System.out.print("enter your choice : ");
      y=sc.nextInt();
      if(y==5)
       break;
      else{
        switch(y){
            case 1:
            System.out.println("Enter element to push : ");
            int data=sc.nextInt();
            s.push(data);
            break;

            case 2 : 
            s.pop();
            break;

            case 3 :
            System.out.println("peek element ---> "+s.peek());
            break;

            case 4:
            s.displayStack();
            break;

            default:
            System.out.println("enter vaild choice from (1 to 5)");
    
        }
    }
      }
    }
}
