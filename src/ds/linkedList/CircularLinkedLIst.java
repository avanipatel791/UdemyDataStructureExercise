package ds.linkedList;

public class CircularLinkedLIst {
    private Node first;
    private Node last;

    CircularLinkedLIst(){
        first = last = null;
    }

    public void insertFirst(int data){
        Node node = new Node();
        node.data = data;

        if(isEmpty()){
            last = node;
        }

        node.node = first;
        first = node;
    }

    public void insetLast(int data){
        Node node = new Node();
        node.data = data;
        if(isEmpty()){
            first = node;
        } else {
            last.node = node;
            last = node;
        }
    }

    public Node deleteFirst(){
        Node tmp = first;

        if(first.node == null){
            last = null;
        }
        first = first.node;
        return tmp;
    }

    public void display(){
        System.out.println();
        Node n = first;
        while(n != null){
            n.displayNode();
            n = n.node;
        }
    }

    public boolean isEmpty(){
        return first==null;
    }
}
