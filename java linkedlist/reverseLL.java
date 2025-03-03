public class reverseLL {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node head;
    public Node tail;
    public int length;

    public void addlast(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
            length++;
            return;
        }
        tail.next=newnode;
        tail=newnode;
        length++;
    } 

    public void PrintList(){
        Node temp=head;
        while(temp != null){
            System.out.print( temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    private  void reverse() {
        Node current=head;
        Node next;
        Node prev=null;

        while (current!=null) {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next; 
        }  
        head=prev;
    }

    
    public static void main(String[] args) {
        reverseLL ll=new reverseLL();
        ll.addlast(0);
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.PrintList();
        ll.reverse();
        ll.PrintList();
    }
}
