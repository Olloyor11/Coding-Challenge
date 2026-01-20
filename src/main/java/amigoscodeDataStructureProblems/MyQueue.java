package amigoscodeDataStructureProblems;

public class MyQueue {

    private int [] queue;
    private int front;
    private int rear;
    private int size;

    public MyQueue(int capacity){
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }public void enqueue(int value) {
        if (size == queue.length  ){
            System.out.println("Queue is full");
            return;
        }
        queue[++rear] = value;
        size++;
    }public int dequeue(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int value =queue[front];
        front ++;
        size --;
        return value;
    }public int peek(){
        return queue[front];
    }public boolean isEmpty(){
        return size ==0;
    }
}
