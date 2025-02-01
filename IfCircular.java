public class IfCircular {
    public static  class node
    {
        int data;
        node next;
        node(int data)
        {
            this.data = data;
        }
    }
    static boolean check(node head)
    {
        node slow =head;
        node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return true;
            }
            
        }
        return false;
    }
    public static void main(String ar[])
    {
                node a = new node(10);
                node b = new node(20);
                node c = new node(30);
                node d = new node(40);
                node e = new node(50);
            a.next=b;
            b.next=c;
            c.next=d;
            d.next=e;
            e.next=a;
            node head = a;
System.out.println(check(head));
    }
}
