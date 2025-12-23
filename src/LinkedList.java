public class LinkedList {

    Node head;
    Node tail;
    int size;

    // Add node at the beginning
    public void add(int data) {
        Node newNode=new Node(data);

        if(head==null){
            head=tail=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
        size++;
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
        size++;
    }


    //Insert new node after given node
    public void insertAfter(int key,int data){
        Node current=head;

        while(current!=null){
            if(current.data==key){
                Node newNode=new Node(data);
                newNode.next=current.next;
                current.next=newNode;

                if(current==tail)
                    tail=newNode;

                size++;
                return;
            }
            current=current.next;
        }
    }


    // Delete first element
    public void pop(){
        if(head==null)
            return;

        head=head.next;

        if(head==null)
            tail=null;
    }

    //Pop last element
    public void popLast(){
        if(head==null)
            return;

        if(head.next==null){
            head=tail=null;
            return;
        }

        Node current=head;
        while(current.next!=tail){
            current=current.next;
        }

        current.next=null;
        tail=current;
    }

    //Search node by key
    public boolean search(int key){
        Node current=head;
        while(current!=null){
            if(current.data==key)
                return true;
            current=current.next;
        }
        return false;
    }

    //Delete node by key
    public void delete(int key){
        if(head==null)
            return;

        if(head.data==key){
            head=head.next;
            size--;
            if(head==null)
                tail=null;
            return;
        }

        Node current=head;
        while(current.next!=null){
            if(current.next.data==key){
                if(current.next==tail)
                    tail=current;
                current.next=current.next.next;
                size--;
                return;
            }
            current=current.next;
        }
    }

    public int size(){
        return size;
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
