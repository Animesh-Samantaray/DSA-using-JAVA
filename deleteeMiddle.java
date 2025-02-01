public class deleteeMiddle {
    static class node{
        int data;
        node next;
        node(int data)
        {
            this.data=data;
        }
    }
    static void deletenode(node head){
        node slow = head;
        node fast=head;
    
        while(fast.next.next!=null && fast.next.next.next != null){
            slow = slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
    }
    
      static  void displayList(node head)
        {
            node temp=head;
            while(temp!=null){ 
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
 
    
    public static void main(String[] args) {
        node a1 = new node(90);
        node b1=new node(45);
        node c1 = new node(5);
        node d1 =new node(6);
        node e1 = new node(7);// 90 45 5 6 7
        a1.next=b1;
        node head1 = a1;
        b1.next=c1;
        c1.next=d1;
        d1.next=e1;
        e1.next=null;
        displayList(head1);
        deletenode(head1);
        System.out.println();
        displayList(head1);
        node a2 = new node(1);//  3 4 5 6 7
        node b2=new node(2);
        node c2 = new node(3);
        node d2 =new node(4);
        node e2 = new node(4);
        node f2=new node(6);
        a2.next=b2;
        node head2 = a2;
        b2.next=c2;
        c2.next=d2;
        d2.next=e2;
        e2.next=f2;
        f2.next=null;
        System.out.println();
        displayList(head2);
        deletenode(head2);
        System.out.println();
        displayList(head2);
    }
}
