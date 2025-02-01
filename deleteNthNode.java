public  class deleteNthNode {
    static class node{
        int data;
        node next;
        node(int data)
        {
            this.data=data;
        }
    }
    static  node deleteAt(node head, int n)
        {
           node slow = head; 
           node fast = head;
           if(n==0 )
           return head ;
       
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        if(fast==null)
        {
            head=head.next;
            return head;
        }
        else { 
        while(fast.next!= null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
    }
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
       
        
    }


}
