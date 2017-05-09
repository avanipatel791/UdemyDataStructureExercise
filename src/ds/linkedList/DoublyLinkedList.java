package ds.linkedList;

public class DoublyLinkedList {

    private DoublyNode first;
    private DoublyNode last;

    public DoublyLinkedList(){
        first = last = null;
    }

    public void insertFirst(int data){
        DoublyNode node = new DoublyNode();
        node.data = data;

        if(isEmpty()){
            last = node;
        } else {
            first.previous = node;
        }

        node.next = first;
        first = node;
    }

    public void insetLast(int data){
        DoublyNode node = new DoublyNode();
        node.data = data;
        if(isEmpty()){
            first = node;
        } else {
            last.next = node;
            node.previous = last;
        }
        last = node;
    }

    public void insertAfter(int key, int data){
        DoublyNode node = new DoublyNode();
        node.data = data;

        DoublyNode n = first;
        while(n.data != key){
            n = n.next;
        }
        if(n == last){
            n.next = null;
            last = n;
        } else {
            node.next = n.next;
            n.next.previous = node;
        }
        node.previous = n;
        n.next= node;
    }

    public DoublyNode deleteNode(int key){
        DoublyNode node = first;
        while (node.data != key){
            node = node.next;
            if(node == null){
                return null;
            }
        }

        if(node == first){
            first = first.next;
        } else {
            node.previous.next = node.next;
        }

        if(node == last){
            last = node.previous;
        } else {
            node.next.previous = node.previous;
        }

        return node;
    }

    public DoublyNode deleteFirst(){
        DoublyNode tmp = first;

        if(first.next == null){
            last = null;
        } else {
            first.next.previous = null;
        }
        first = first.next;
        return tmp;
    }

    public DoublyNode deleteLast(){
        DoublyNode tmp = first;
        if(first.next == null){
            first = null;
        } else {
            last.previous.next = null;
        }
        last = last.previous;
        return tmp;
    }

    public void display(){
        System.out.println();
        DoublyNode n = first;
        while(n != null){
            n.displayNode();
            n = n.next;
        }
    }

    public boolean isEmpty(){
        return first==null;
    }
}
