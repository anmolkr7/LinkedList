//Node represent single element in of the linked list
public class Node {
    int data;   //data to be stored in the node
    Node next;  //reference pointer to the next node

    //Constructor that initializes the node with data and set next reference to null
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}