package ds.queue;

public class Queue {
    int maxSize;
    int[] queueArray;
    int front;
    int rear;
    int noOfItems;

    Queue(int size){
        maxSize = size;
        queueArray = new int[size];
        front = 0;
        rear = -1;
        noOfItems = 0;
    }

    public void insert(int data){
        if(rear == maxSize){
            rear = -1;
        }
        rear++;
        queueArray[rear] = data;
        noOfItems++;
    }

    public int delete(){
        int tmp = queueArray[front];
        front++;
        if(front == maxSize){
            front = 0;
        }
        noOfItems--;
        return tmp;
    }

    public int peek(){
        return queueArray[front];
    }

    public void display(){
        for (int i=front; i<queueArray.length; i++){
            System.out.print("--" + queueArray[i] + "--");
        }
    }

}
