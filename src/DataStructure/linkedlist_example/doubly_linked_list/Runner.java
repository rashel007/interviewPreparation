package DataStructure.linkedlist_example.doubly_linked_list;

public class Runner {

    public static void main(String[] args) {
        MyDoublyLinkedList myDoublyLinkedList = new MyDoublyLinkedList();

//        myDoublyLinkedList.insert(2);
//        myDoublyLinkedList.insert(3);
//        myDoublyLinkedList.insert(4);

        myDoublyLinkedList.insert(5,1);
        myDoublyLinkedList.insert(7,2);

        myDoublyLinkedList.insert(6,2);
        myDoublyLinkedList.insert(4,1);

        System.out.println("Size : " + myDoublyLinkedList.size());
        System.out.println();
        myDoublyLinkedList.show();
    }
}
