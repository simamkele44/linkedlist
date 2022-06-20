package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linked_list = new LinkedList(18);
        linked_list.insertStart(25);
        linked_list.insertEnd(45);
        linked_list.insertEnd(12);
        linked_list.insertPos(2, 55);
        linked_list.insertPos(0, 22);
        linked_list.show();
        System.out.println("head: "+linked_list.getHead());
    }
}
