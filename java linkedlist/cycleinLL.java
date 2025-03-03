public class cycleinLL {

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

    public static boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast) {
                return true;
            }
        }

        return false;
    }

    public void PrintList(){
        Node temp = head;
        while(temp != null){
            System.out.print( temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        cycleinLL ll =new cycleinLL();
        head = ll.new Node(0);
        head.next=ll.new Node(1);
        head.next.next=ll.new Node(2);
        head.next.next.next=ll.new Node(3);
        head.next.next.next.next=head;
        // ll.PrintList();
        System.out.println(isCycle());
    }
    
}