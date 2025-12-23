public class SortedLinkedList {
    Node head;

    //Add node in sorted order
    public void add(int data){
        Node newNode=new Node(data);

        // Insert at beginning
        if(head==null || data<head.data){
            newNode.next=head;
            head=newNode;
            return;
        }

        // Insert at correct position
        Node current=head;
        while(current.next!=null && current.next.data<data){
            current=current.next;
        }

        newNode.next=current.next;
        current.next=newNode;
    }

    public void print(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }
}
