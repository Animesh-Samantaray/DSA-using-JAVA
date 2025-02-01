public class implementation {
    static class node
    {
        int data;
        node next,prev;
        node(int data)
        {
            this.data=data;
        }
    }

    static class doubleyLinkedList{
        static node head = null;
        static node tail=null;

static  void displayListByHead(node head)
{
    if(head == null)
    return ;
    System.out.print(head.data+" ");
    displayListByHead(head.next);
}


static void displayRevFromTail(node tail)
{
    if(tail==null)
    return ;
    System.out.print(tail.data+" ");
    displayRevFromTail(tail.prev);
}


static void displayListByTail(node tail)
{
    if(tail==null)
    return ;
    displayListByTail(tail.prev);
    System.out.print(tail.data+" ");

}



static void insertAtTail(int data){
    node temp=new node(data);
    if(head==null){
        head=temp;
        tail=temp;
        return;
    }
    tail.next=temp;
    temp.next=null;
    temp.prev=tail;
    tail=temp;

}



static void InsertAtHead(int data)
{
    node temp = new node(data);
    if(head==null){
        head=temp;
        tail=temp;
        return;
    }
    temp.prev=null;
    temp.next=head;
    head.prev=temp;
    head=temp;
}



static void InsertAtAnyIndex(int idx , int data)
{
    node box = new node(data);
    node temp=head;
    while(idx!=1){
        temp=temp.next;
        idx--;
    }
    box.next=temp.next;
    box.prev=temp;
    temp.next=box;
    box.next.prev=box;   
}

    static void deleteFromHead()
    {
        if(head.next==null){
            head=null;
            return ;
        }
    head=head.next;
    head.prev=null;
    
    }
//  1 2 3 4 5

    static void deleteFromTail()
    {
        if(head.next==null){
            head=null;
            return ;
        }
        tail=tail.prev;
        tail.next=null;
    }

    static void deleteAtIndex(int idx)
    {
        node temp = head;
        while(idx!=1)
        {
            temp=temp.next;
            idx--;
        }
        if(temp==head){
            deleteFromHead();
        }
        else if(temp==null){
            deleteFromTail();
        }
        else { 
        node a = temp.prev;
        node b = temp.next;
        a.next=b;
        b.prev=a;
        }
    }

    }

    public static void main(String ar[])
    {
      doubleyLinkedList d = new doubleyLinkedList();
      d.insertAtTail(10);
      d.insertAtTail(20);
      d.insertAtTail(30);
      d.InsertAtHead(122);
      d.InsertAtAnyIndex(1, 133440);
      d.deleteAtIndex(2);


       d.displayListByHead(d.head);
       
    }
}
