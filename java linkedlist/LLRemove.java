public class LLRemove {

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
        Node temp = head;
        while(temp != null){
            System.out.print( temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void firstremove(){
        Node temp=head;
        head=temp.next;
        temp.next=null;
        length--;
    }

    public void lastremove(){
        if (length==0) {
            System.out.println("LL empty");
            return;
        }else if (length==1) {
            head=tail=null;
            return;
        }
        Node temp=head;
        while (temp.next.next!=null) {
            temp=temp.next;
        }
        temp.next=null;
        length--;
    }

    public static void main(String[] args) {
        LLRemove ll = new LLRemove();
        ll.addlast(0);
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        // ll.firstremove();
        ll.lastremove();
        ll.PrintList();
        System.out.println(ll.length);
    }
}

