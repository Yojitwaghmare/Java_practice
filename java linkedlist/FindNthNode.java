public class FindNthNode {
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

    public void remove(int n){
        Node temp=head;
        Node delet=null;
        if (n==0) {
            head=temp.next;
            temp=null;
            return;
        }
        for (int i = 1; i < n; i++) {
            temp =temp.next;
            delet=temp.next;
        }
        temp.next=delet.next;
        delet=null;
        length--;
    }

    public static void main(String[] args) {
        FindNthNode ll=new FindNthNode();
        ll.addlast(0);
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.PrintList();
        ll.remove(0);
        ll.PrintList();
    }
}
