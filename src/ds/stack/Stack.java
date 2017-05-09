package ds.stack;

public class Stack {
    int size;
    int[] stackArray;
    int top;

    Stack(int size){
        this.size = size;
        this.stackArray = new int[size];
        this.top = -1;
    }

    public void push(int data){
        top++;
        stackArray[top] = data;
    }

    public int pop(){
        int tmp = top;
        top--;
        return stackArray[tmp];
    }

    public int peek(){
        return stackArray[top];
    }

    public void display(){
        for(int i=0;i<=top; i++){
            System.out.print("-" + stackArray[i] + "-");
        }
    }

    public boolean isEmpty(){
        return top==-1;
    }
}
