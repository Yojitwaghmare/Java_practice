// import java.util.LinkedList;

public class mergesortLL {
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
    public void PrintList(){
        Node temp = head;
        while(temp != null){
            System.out.print( temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public Node middle(Node head){
        Node slow=head;
        Node fast=head.next;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public Node merge(Node head1,Node head2){
        Node middle=new Node(-1);
        Node temp=middle;
        while (head1!=null&&head2!=null) {
            if (head1.data<=head2.data) {
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }

        while (head1!=null) {
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }

        while (head2!=null) {
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }

        return middle.next;
    }

    public Node mergesort(Node head){
        if (head==null|| head.next==null) {
            return head;
        }
        Node mid=middle(head);
        Node right=mid.next;
        mid.next=null;

        Node newLeft=mergesort(head);
        Node newRight=mergesort(right);
        return merge(newLeft,newRight);
    }

    public void addlast(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
            // length++;
            return;
        }
        tail.next=newnode;
        tail=newnode;
        // length++;
    }
    public static void main(String[] args) {
        mergesortLL ll=new mergesortLL();
        ll.addlast(5);
        ll.addlast(4);
        ll.addlast(3);
        ll.addlast(2);
        ll.addlast(1);
        ll.PrintList();
        ll.head=ll.mergesort(ll.head);
        ll.PrintList();
    }
}
