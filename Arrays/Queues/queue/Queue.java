package Queues.queue;

public class Queue {

    private int maxSize;
    private long[] queue;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size){

        maxSize = size;
        queue = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long j){

        if(rear == (maxSize-1)){
            rear = -1;
        }
        queue[++rear] = j;
        nItems++;
    }

    public long remove(){

        long temp = queue[front];
        front++;
        if(front == maxSize){
            front = 0;
        }
        nItems--;
        return temp;
    }

    public long peekFront(){

        return queue[0];
    }

    public boolean isempty(){

        return (nItems == 0);
    }

    public boolean isFull(){

        return (nItems == maxSize);
    }

    public int size(){
        return nItems;
    }
}