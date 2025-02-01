

 class findTwoSum 
  {

    static class node
    {
        int data;
        node next;
        node prev;
        node(int data)
        {
            this.data=data;
        }
    }
    
  public static class singlyLinkedList
  {
        static  node head=null ,tail=null;
 
         static void InsertAtHead(int data){
             
           node temp = new node(data);
           if(head==null){
                 head=temp;
                 tail=temp;
                 tail.next=head;
                 head.prev=tail;
                 return ;
             }
         temp.next=head;
         head.prev=temp;
         head=temp;
         tail.next=head;
         head.prev=tail;
         }
         
 
         static void insertAtTail(int data){
             node temp = new node(data);
             if(head==null){
                 head=temp;
                 tail=temp;
                 tail.next=head;
                 head.prev=tail;
                 return ;
             }
             tail.next= temp;
             temp.prev=tail;
             temp.next=head;
             tail=temp;
             head.prev=tail;
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
         
         static void findTwinSum(int data)
         {
            node h = head;
            node t = tail;
            while(h.data<t.data)
            {
                if(h.data+t.data==data)
                {
                    System.out.print(h.data+"  "+t.data);
                    break;
                }

                else if(h.data+t.data<data)
                {
                    h=h.next;
                }
                else{
                    t=t.prev;
                }
            }
         }
     }
     public static void main(String[] args) {
        singlyLinkedList l = new singlyLinkedList();
        l.insertAtTail(10);
        l.insertAtTail(20);
        l.insertAtTail(30);
        l.insertAtTail(40);
      //  l.InsertAtTail(100);
        l.insertAtTail(150);
        l.displayList(l.head);
        System.out.println();
        l.findTwinSum(190);
     }
}
