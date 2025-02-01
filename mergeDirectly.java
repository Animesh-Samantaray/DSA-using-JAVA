
public class mergeDirectly {
    static class node
    {
        int data;
        node next;
            node(int data)
            {
                this.data=data;
            }
    }
    static class linkedList
    {
        node head=null;
        node tail=null;

        void insertAtEnd(int data){
        
        node temp = new node(data);
        if(head==null){
            head=temp;
            tail=temp;
        }
        else{
            tail.next=temp;
            temp.next=null;
            tail=temp;
        }

        }
    }

    public static node mergeD(node head1 , node head2)
    {
        node t1=head1;
        node t2 = head2;
        node head =new node(10);
        node t=head;

        while(t1!=null && t2!= null)
        {
            if(t1.data<t2.data){ 
            t.next=t1;
            t=t.next;
            t1=t1.next;
        }
        else if(t2.data<t1.data)
        {
           t.next=t2;
            t=t.next;
            t2=t2.next;
        }
       }

       if(t1!=null){
        t.next=t1;
       }
       else if(t2!= null)
       {
        t.next=t2;
       }
       head=head.next;
       return head;
    }
    static void displayList(node head)
    {
   node temp=head;
        while(temp!=null){ 
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
}
    public static void main(String[] args) {
        linkedList a1 = new linkedList();
        a1.insertAtEnd(10);
        a1.insertAtEnd(20);
        a1.insertAtEnd(30);
        a1.insertAtEnd(145);
        a1.insertAtEnd(200);
        

        linkedList a2 = new linkedList();
        a2.insertAtEnd(9);
        a2.insertAtEnd(19);
        a2.insertAtEnd(29);
        a2.insertAtEnd(40);
        a2.insertAtEnd(100);
        a2.insertAtEnd(400);
        a2.insertAtEnd(1000);
        node h = mergeD(a1.head,a2.head);
        displayList(h);
    }
}
