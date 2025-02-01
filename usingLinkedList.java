
import java.util.Scanner;

public class usingLinkedList 
{
    static class node {
        node next;
        int data;
        node(int data){
            this.data=data;
        }
     }

     static class StackLL
     {
        int k=-1;
        Scanner sc = new Scanner(System.in);
        node head=null;
        void push(int data)
        {
            node temp = new node(data);
            temp.next=head;
            head=temp;
            k++;
        }

        void pop()
        {
            if(k==-1)
            System.out.println("Stack Underflow");
             else{
                head=head.next;
                k--;
             }
        }
        void peek()
        {
            System.out.println("Peek element = "+head.data);
        }
        void displayrev(node head){
            if(head==null) return ;

            displayrev(head.next);
            System.out.print(head.data+" ");
        }
        void display(){
            displayrev(head);
        }


     }
     public static void main(String[] args) {
        StackLL s = new StackLL();
        s.push(10);
        s.push(30);
        s.push(33);
        s.push(112);
        s.peek();
        s.display();
     }
}
