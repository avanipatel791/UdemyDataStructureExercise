package ds.queue;

public class QueueApp {
    public static void main(String[] args){
        Queue q = new Queue(5);

        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.insert(4);
        q.insert(5);
        q.display();
        System.out.println("------");
        System.out.println(q.delete());
        System.out.println("------");
        System.out.println(q.peek());
        System.out.println("------");
        q.display();
        System.out.println("------");

        q.insert(6);
        q.display();
    }
}
