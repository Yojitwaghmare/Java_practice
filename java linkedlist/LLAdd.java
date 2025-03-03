public class LLAdd {
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

    public void addfirst(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
            length++;
            return;
        }
        newnode.next=head;
        head=newnode;
        length++;
    }
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

    public void addmiddle(int index,int data){
        if (index==0) {
            addfirst(data);
            return;  
        }
        if (index==length) {
            addlast(data);
            return;
        }
        if (index>length) {
            System.out.println("length Exceed");
            return;
        }
        Node newNode = new Node(data);
        int i=0;
        Node temp=head;
        while (i<index-1) {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        length++;
    }
    public static void main(String[] args) {
        LLAdd ll = new LLAdd();
        ll.addlast(0);
        ll.addlast(2);
        ll.addlast(3);
        ll.addmiddle(1, 1);
        ll.PrintList();
        System.out.println(ll.length);
    }
}
