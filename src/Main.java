public class Main {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();

        // Initial list: 56 -> 70
        list.append(56);
        list.append(70);

        // Insert 30 between 56 and 70
        list.insertAfter(56,30);

        list.print();
    }
}
