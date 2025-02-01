public class mergeSortedLL {
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

        static node merge(node head1 , node head2)
        {
            node temp1=head1;
            node temp2 = head2;
            node temp = new node(0);
            node head = temp;
            while(temp1!= null  &&  temp2!= null)
            {
                if(temp1.data<temp2.data)
                {
                    node a = new node(temp1.data);
                    temp.next=a;
                    temp = temp.next;
                    temp1=temp1.next;
                }
                else
                {
                    
                        node a = new node(temp2.data);
                        temp.next=a;

                        temp = temp.next;
                        temp2=temp2.next;
                    
                }
            }
            while(temp1!=null){
                node a = new node(temp1.data);
                temp.next=a;

                temp=temp.next;
                temp1=temp1.next;
            }
            while(temp2!=null)
            {
                node a = new node(temp2.data);
                temp.next=a;

                temp=temp.next;
                temp2=temp2.next;
            }

            return head.next;
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
        a1.insertAtEnd(199);
        a1.insertAtEnd(200);

        linkedList a2 = new linkedList();
        a2.insertAtEnd(9);
        a2.insertAtEnd(19);
        a2.insertAtEnd(29);
        a2.insertAtEnd(40);
        a2.insertAtEnd(100);
        a2.insertAtEnd(150);


         node imp = merge(a1.head,a2.head);
         displayList(imp);
    }
}
