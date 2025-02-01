public class findOddevenList {
    static class node {
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
        while(temp!=null){
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
    }


    static void differOddEven(node head)
    {
        node temp =head;
        node tempe=head,te=head,to=head,tempo=head;
        while(temp!=null)
        {
            if(temp.data%2==0){
                tempe=temp;
                te=tempe;
                break;
            }
            temp=temp.next;
    
        }
        temp=head;
        while(temp!=null)
        {
           if(temp.data%2!=0){
                tempo=temp;
                to=tempo;
                break;
            }
            temp=temp.next;
        }
        temp=head;
        while(temp!=null)
        {
            if(temp.data%2==0 && temp!=te){
                tempe.next=temp;
                temp=temp.next;
                tempe=tempe.next;
            }
            else if(temp.data%2 != 0 && temp!=to){
                tempo.next=temp;
                tempo=tempo.next;
                temp=temp.next;
            }
            else
            temp=temp.next;
        }
        tempe.next=null;
        tempo.next=null;
    displayList(to);
    System.out.println();
    displayList(te);
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
        h.next=null;
       differOddEven(head);
      
    }
}
