public class deletecycleLL {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public Node tail;

    public  void delete(){
        Node slow=head;
        Node fast=head;
        Node prev=null;
        boolean cycle=false;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast) {
                slow=head;
                cycle=true;
                break;
            }
        }
        if (cycle==false) {
            return;
        }
        while (slow!=fast) {
            prev=fast;
            slow=slow.next;
            fast=fast.next;
            
        }

        prev.next=null;
    }

    public  void PrintList(){
        Node temp = head;
        while(temp != null){
            System.out.print( temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        deletecycleLL ll=new deletecycleLL();
        head = ll.new Node(0);
        Node temp =ll.new Node(1);
        head.next=temp;
        head.next.next=ll.new Node(2);
        head.next.next.next=ll.new Node(3);
        head.next.next.next.next=ll.new Node(4);
        // head.next.next.next.next.next=temp;
        ll.delete();
        ll.PrintList();
    }
}
