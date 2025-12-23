public class Main {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();

        // Create list: 56->30->40->70
        list.append(56);
        list.append(30);
        list.append(40);
        list.append(70);

        // Delete 40
        list.delete(40);

        list.print();
        System.out.println("Size: "+list.size());
    }
}
