public class Main {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();

        // Create list: 56->30->70
        list.append(56);
        list.append(30);
        list.append(70);

        // Insert 40 after 30
        list.insertAfter(30,40);

        list.print();
    }
}
