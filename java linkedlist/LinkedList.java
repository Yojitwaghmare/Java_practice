
public class LinkedList {
    private Node Head;
    private Node tail;
    private int length;


    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public LinkedList(int value){
        Node newNode = new Node(value);
        Head = newNode;
        tail =newNode;
        length =1;
    }

    

   public void append(int value) {
    Node newNode = new Node(value);
    if (length == 0) {
        Head = newNode;
        tail = newNode;
    } else {
        tail.next = newNode;
        tail = newNode;
    }
    length++;
}

public Node RemoveLast() {
    if(length == 0) return null;
    Node temp=Head;
    Node pre=tail;
    while (temp.next != null) {
         pre=temp;
         temp=temp.next;
         }
         tail=pre;
         tail.next = null;
         length--;
    if(length == 0) {
        Head=null;
        tail=null;
    }
    return temp;
}
public void Prepend(int value){
    Node newNode = new Node(value);
    if(length == 0) {
        Head=newNode;
        tail=newNode;
    }else{
        newNode.next=Head;
        Head=newNode;
    }
}


public Node RemoveFirst() {
      if(length==0) return null;
      Node temp = Head;
      Head= Head.next;
      temp.next=null;
      length--;
      if(length==0) {
        tail=null;
      };
return temp;
}
public void PrintList(){
    Node temp = Head;
    while(temp != null){
        System.out.println("List contain: "+ temp.value);
        temp = temp.next;
    }
}

public Node get(int index){
    if(index< 0 || index >=length)return null;
    Node temp = Head;
    for(int i=0; i<index; i++){
        temp=temp.next;
    }
    return temp;
}

public boolean set(int index,int value) {
    Node temp=Head;
    for(int i=0; i<index;i++){
        temp=temp.next;
    }
    temp.value=value;
    return true;
}

public boolean Insert(int index,int value){
    Node newNode = new Node(value);
    if(index < 0||index > length)return false;
    if (index==0) {
        Prepend(value);
    }
    if(index==length){
        append(value);
    }
    Node temp = get(index-1);
    newNode.next = temp.next;
    temp.next = newNode;
    length++;

    return true;
   }

   public Node Remove(int index) {
    if(index<0||index >= length) return null;
    if(index ==0) return RemoveFirst();
    if(index == length) return RemoveLast();
    

    Node prev =get(index-1  );
    Node temp =prev.next;
    prev.next = temp.next;
    temp.next = null;
    return temp;
   }


   public void Reverse(){
    Node temp = Head;
    Head = tail;
    tail = temp;
    Node after = temp.next;
    Node before = null;
    for(int i=0; i<length; i++){
        after = temp.next;
        temp.next = before;
        before=temp;
        temp = after;

    }
   }
public void getHead(){
    System.out.println("Head: "+ Head.value);
   }

   public void gettail(){
    System.out.println("tail: "+ tail.value);
   }

   public void getlength(){
    System.out.println("length: "+ length);
   }
   
   
   
   public static void main(String[] args) {
    
    LinkedList List=new LinkedList(1);
    List.append(2);
    List.append(3);
    List.append(4);
    //    List.RemoveFirst();
    // List.getHead();
    // List.gettail();
    // List.getlength();
    // System.out.println();
    // System.out.println(List.set(2,6));
    // List.Insert(2,5);
    // List.Remove(2);
    List.Reverse();
    List.PrintList();
    // System.out.println(List.RemoveLast().value);
    // System.out.println(List.RemoveLast().value);
   }



}
