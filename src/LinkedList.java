public class LinkedList {

    Node head;

    // Add node at the beginning
    public void add(int data) {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
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
