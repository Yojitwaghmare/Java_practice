public class palindrome {
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

    public Node middle(Node head){
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public Boolean checkpalindrome(Node head){
        if (head==null||head.next==null) {
            return true;
        }
        Node mid=middle(head);

        Node current=mid;
        Node next;
        Node prev=null;
        while (current!=null) {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next; 
        }  
        Node right=prev;
        Node left=head;

        while (right!=null) {
            if (left.data!=right.data) {
                return false;
            }
            left=left.next;
            right=right.next;
        }

        return true;
    }
    public static void main(String[] args) {
        palindrome ll=new palindrome();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(2);
        ll.addlast(1);
        System.out.println(ll.checkpalindrome(ll.head));
    }
}
