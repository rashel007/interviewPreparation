package DataStructure.linkedlist_example;

public class Runner {

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.insert(5,1);
        linkedList.insert(6,2);
        linkedList.insert(8,3);

        linkedList.delete(3);
        linkedList.delete(2);
        linkedList.delete(1);


//        linkedList.insert(6);

        linkedList.show();
      //  System.out.println(linkedList.size());
    }
}
