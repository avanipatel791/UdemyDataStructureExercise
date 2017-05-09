package ds.linkedList;

public class SinglyLinkList {
    private Node first;

    public SinglyLinkList(){
        first = null;
    }

    public void insertFirst(int data){
        Node node = new Node();
        node.data = data;
        node.node = first;
        first = node;
    }

    public Node deleteFirst(){
        Node tmp = first;
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
