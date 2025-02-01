public class OddevenNodeCombine {
   static class node{
        int data;
        node next;
        node(int data)
        {
            this.data=data;
        }
    }

    static void displayList(node head)
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    static void combine(node head)
    {
        node heade = new node(0);
        node heado=new node(0);
        node he=heade;
        node ho=heado;
        node temp=head;
        while(temp!=null)
        {
            he.next=temp;
            he=he.next;
            temp=temp.next;
            ho.next=temp;
            if(temp==null)  break;
            ho=ho.next;
            temp=temp.next;
        }
        heade=heade.next;
        heado=heado.next;
        he.next=heado;
        displayList(heade);
    }
    public static void main(String[] args) {
        node a = new node(1);
        node b = new node(2);
        node c = new node(3);
        node d = new node(4);
        node e = new node(5);
        node f = new node(6);
        node h = new node(7);
        node i = new node(8);
            a.next=b;
            b.next=c;
            c.next=d;
            d.next=e;
            e.next=f;
            f.next=h;
            h.next=i;
            i.next=null;
            node head=a;  
            combine(head);
    }
}
