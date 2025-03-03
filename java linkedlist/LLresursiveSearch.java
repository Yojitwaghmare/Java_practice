public class LLresursiveSearch {
    public static int Recursive(LLAdd.Node head,int num,int index){
        if (head.data==num) {

            // System.out.println("found at "+index);
            return index;
        }
        if (head.next==null) {
            // System.out.println("not found");
            return -1;
        }
        return Recursive(head.next, num,index+1);
    }

    public static void main(String[] args) {
        LLAdd ll=new LLAdd();
        ll.addlast(0);
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        LLAdd.Node temp=ll.head;
        int A=Recursive(temp,10,0);
        System.out.println(A);
    }
}
