package linkedlist;

public class Application {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
//        for (int i = 0; i < 10; i++) {
//            myLinkedList.insert(i+2);
//        }
        myLinkedList.insert(77);
        myLinkedList.insert(5);

        myLinkedList.print();

        System.out.println("Linked list size is: " + myLinkedList.size());

        myLinkedList.deleteByKey(5);

        myLinkedList.print();
    }

}
