package ds.linkedList;

public class LinkedListApp {
    public static void main(String[] args){
        SinglyLinkList sl  = new SinglyLinkList();
        sl.insertFirst(1);
        sl.insertFirst(2);
        sl.insertFirst(3);
        sl.insertFirst(4);
        sl.insertFirst(5);
        sl.deleteFirst();
        sl.display();

        CircularLinkedLIst cl = new CircularLinkedLIst();
        cl.insertFirst(1);
        cl.insertFirst(2);
        cl.insertFirst(3);
        cl.insetLast(4);
        cl.insetLast(5);
        cl.deleteFirst();
        cl.display();

        /*DoublyLinkedList dl = new DoublyLinkedList();
        dl.insertFirst(1);
        dl.insertFirst(2);
        dl.insertFirst(3);
        dl.insertFirst(4);
        dl.deleteFirst();
        dl.insetLast(5);
        dl.insetLast(6);
        dl.insetLast(7);
        dl.display();*/

        /*DoublyLinkedList dl1 = new DoublyLinkedList();
        dl1.insertFirst(1);
        dl1.insertFirst(2);
        dl1.insertFirst(3);
        dl1.insetLast(5);
        dl1.insetLast(6);
        dl1.insertAfter(2,7);
        dl1.insertAfter(5,8);
        dl1.insertAfter(1,9);
        dl1.display();*/

        DoublyLinkedList dl2 = new DoublyLinkedList();
        dl2.insertFirst(1);
        dl2.insertFirst(2);
        dl2.insertFirst(3);
        dl2.insetLast(5);
        dl2.insetLast(6);
        dl2.insertAfter(2,7);
        dl2.insertAfter(5,8);
        dl2.deleteNode(6);
        dl2.display();
    }
}
