package graphodev2;

public class LinkedList {

    Node head;
    Node tail;

    public LinkedList() {

        head = null;
        tail = null;

    }

    boolean isEmpty() {

        return head == null;
    }

    void addNode(char data) {

        Node new_node = new Node(data);

        if (isEmpty()) {

            head = new_node;
            tail = new_node;
        } else {
            
           tail.next = new_node;
           new_node = tail;
        }
    } 
}
