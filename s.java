public class s {
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }

     public static class singlyLinkedList{
       static  node head=null ,tail=null;

        static void InsertatHead(int data){
            
          node temp = new node(data);
          if(head==null){
                head=temp;
                tail=temp;
                tail.next=head;
            }
        temp.next=head;
        head=temp;
        tail.next=head;
        }
        

        static void insertAtTail(int data){
            node temp = new node(data);
            if(head==null){
                head=temp;
                tail=temp;
                tail.next=head;
            }
            tail.next= temp;
            temp.next=head;
            tail=temp;
        }
        

        static void displayList(node head)
        {
            System.out.print(head.data+" ");
            node temp = head.next;
            while(temp != head)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }    
    }

    public static void main(String[] args) {
        singlyLinkedList l = new singlyLinkedList();
        l.insertAtTail(10);
        l.insertAtTail(20);
        l.insertAtTail(30);
        l.insertAtTail(40);
        l.InsertatHead(100);
        l.displayList(l.head);
    }
}
