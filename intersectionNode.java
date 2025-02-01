public class intersectionNode {
    static class node{
        int data;
        node next;
        node(int data)
        {
            this.data=data;
        }
    }
    public static node getIntersectionNode(node head1 , node head2)
    {
        int m=0;//size of list 1
        int n=0;// size of list 2
        node temp1=head1;
        node temp2=head2;

        while(temp1!=null)
        {
            m++;
            temp1=temp1.next;
        }
        while(temp2!=null)
        {
            n++;
            temp2=temp2.next;
        }
        temp1=head1;
        temp2=head2;
        if(m>n){
            for(int i=1;i<=m-n;i++)
            {
                temp1=temp1.next;
            }
        }
        else if(m<n){
            for(int i=1;i<=n-m;i++)
            {
                temp2=temp2.next;
            }
        }
      
        while(temp1.data != temp2.data)
        {
            temp1=temp1.next;
            temp2=temp2.next;
        }
        
        return temp1;
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



        node a2 = new node(1);//  3 4 5 6 7
        node b2=new node(2);
        node c2 = new node(3);
        node d2 =new node(4);
        node e2 = new node(4);
        node f2=new node(6);
        node g2=new node(7);
        a2.next=b2;
        node head2 = a2;
        b2.next=c2;
        c2.next=d2;
        d2.next=e2;
        e2.next=f2;
        f2.next=g2;
        g2.next=null;

        node x = getIntersectionNode(head1, head2);
        System.out.println(x.data);
    }
}
