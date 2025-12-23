public class LinkedList {

    Node head;
    Node tail;

    // Add node at the beginning
    public void add(int data) {
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }

    // Add at end
    public void append(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
    }

    public void print() {
        Node current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }
}
