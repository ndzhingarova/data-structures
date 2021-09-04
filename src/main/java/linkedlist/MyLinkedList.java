package linkedlist;

public class MyLinkedList {
    private Node head;

    public void insert(int data) {
        Node newNode = new Node(data);

        if (this.head == null) {
            this.head = newNode;
        } else {
            Node last = head;
            while (last.getNext() != null) {
                last = last.getNext();
            }
            last.setNext(newNode);
        }
    }

    public void print() {
        Node current = head;

        System.out.println("Linked list: ");
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }
    }

    public int size() {
        int counter = 0;
        Node current = head;

        while (current != null) {
            counter++;
            current = current.getNext();
        }

        return counter;
    }

    public void deleteByKey(int key) {
        Node current = head;
        Node previous = null;

        if (current != null && current.getData() == key) {
            head = current.getNext();
        } else {

            while (current != null && current.getData() != key) {
                previous = current;
                current = current.getNext();
            }
            if (current != null && current.getData() == key) {
                previous.setNext(current.getNext());
                System.out.println(key + " found and deleted");
            } else {
                System.out.println(key + " not found");
            }
        }

    }
    //TODO : next deleteAtPosition
}
