package LinkedList;

public class LinkedList {
    Node head;
    static int size;

    LinkedList(int data) {
        Node node = new Node(data);
        this.head = node;
        size++;
    }

    public int getHead() {
        return this.head.getData();
    }
    public int getSize() {
        return size;
    }

    public void insertStart(int data) {
        Node new_head = new Node(data);
        new_head.next = this.head;
        this.head = new_head;
        size++;
    }

    public void insertEnd(int data) {
        Node new_tail = new Node(data);
        Node new_node = this.head;
        for(int i=0; i<size; i++) {
            if(new_node.next==null) {
                new_node.next = new_tail;
                size++;
            }else{
                new_node = new_node.next;
            }
        }

    }

    public void insertPos(int pos, int data) {
        Node new_insert = new Node(data);
        Node new_node = this.head;
        if(pos==0) {
            insertStart(data);
        }else if(pos==size-1){
            insertEnd(data);
        }else{
            for(int i=0; i<pos+1; i++) {
                if(i==pos-1) {
                    Node current_next = new_node.next;
                    new_node.next = new_insert;
                    new_insert.next = current_next;
                    size++;
                }else{
                    new_node = new_node.next;
                }
            }
        }


    }

    public void show() {
        Node node = this.head;
        for(int i =0; i <size; i++) {
            System.out.println(node.getData());
            node = node.next;
        }
    }

}
