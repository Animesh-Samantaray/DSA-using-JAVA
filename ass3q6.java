// public class ass3q6 {
//     static class node{
//         int data;
//         node next;
//         node(int data){
//             this.data=data;
//         }
//     }

//    static node separate(node head){
// node odd=new node(0);
// node even = new node(0);
// node temp=head,o=odd,e=even;
// while(temp!=null){
//     o.next=temp;
//     o=o.next;
//     temp=temp.next;
// if(temp!=null){ 
//     e.next=temp;
//     e=e.next;
//     temp=temp.next;
// }
// }
// e.next=null;
// odd=odd.next;
// even=even.next;
// o.next=even;

// return odd;
//    }

//  static void displayList(node head){
//     if(head==null) return ;
//     System.out.print(head.data+" ");
//     displayList(head.next);
//  }
//     public static void main(String arr[])
//     {
//         node a = new node(1);
//         node b = new node(2);
//         node c = new node(3);
//         node d = new node(4);
//         node e = new node(5);
//         node f = new node(6);
//         node g = new node(7);
//         node h = new node(8);
//         node i = new node(9);

//             a.next=b;
//             b.next=c;
//             c.next=d;
//             d.next=e;
//             e.next=f;
//             f.next=g;
//             g.next=h;
//             h.next=i;
//             i.next=null;
//             node head=a;

//           head= separate(head);
//            displayList(head);
//     }
// }
import java.util