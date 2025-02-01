 
public class findListLength {
    static class node{
        int  data; 
        node next;
        node(int data)
        {
            this.data=data;
        }
    }
    static int findlen(node head)
    {
        node temp = head;
        node slow=head,fast=head;
        int x=0;
        if(head==null || head.next==null) return x;


        else{
            while(slow!=fast)
            {
                if(fast.next==null || fast.next.next==null){
                    return x;
                }
                else{
                    slow=slow.next;
                    fast=fast.next.next;
                    if(slow==fast) break;
                }
            }
            while(temp!=slow){
                slow=slow.next;
                temp=temp.next;
            }
             temp = slow.next;
   
    while(temp!=slow){
        x++;
        temp=temp.next;
    }
        }
       return x+1;
    }
    public static void main(String[] args) {
        node a2 = new node(1);//  3 4 5 6 7
        node b2=new node(2);
        node c2 = new node(3);
        node d2 =new node(4);
        node e2 = new node(4);
        node f2=new node(67);
        node g2=new node(193);
        node h = new node(1009);
        a2.next=b2;
        node head = a2;
        b2.next=c2;
        c2.next=d2;
        d2.next=e2;
        e2.next=f2;
        f2.next=g2;
        g2.next=h;
        h.next=c2;
        
        System.out.println(findlen(head));
    }
}
