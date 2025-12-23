public class Main {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();

        // Create list: 56->30->70
        list.append(56);
        list.append(30);
        list.append(70);

        // Search for 30
        if(list.search(30)){
            System.out.println("Node with value 30 found");
        }else{
            System.out.println("Node with value 30 not found");
        }
    }
}
