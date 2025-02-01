public class findMiddle {
    static class node{
        int data;
        node next;
        node(int data)
        {
            this.data=data;
        }
    }
  public static node getmiddle(node head)
  {
    node slow = head;
    node fast=head;
    while( fast.next!= null &&(fast!= null && fast.next.next != null)){
        slow = slow.next;
        fast=fast.next.next;
    }
    return slow;
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
        System.out.println("Middle = "+getmiddle(head1).data);


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
        System.out.println( "middle = "+ getmiddle(head2).data);
}
}
