package data_structures.queue;



public class OurQueue<T> {

    Object[] arrayQueue;
    int rear,front,maxSize,items;

    public OurQueue(int maxSize) {
        this.maxSize = maxSize;
        arrayQueue = new Object[this.maxSize];
        front = 0 ;
        rear = -1;
        items = 0;
    }

    public void enqueue(T value){
        if (isFull()){
            System.out.println("ArrayQueue is full");
        }else {
            rear++;
            arrayQueue[rear] = value;
            items++;
        }

    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }else {
            Object objectsOut = arrayQueue[front];
            for (int i = 1 ; i < arrayQueue.length ; i++){
                Object tmp ;
                tmp = arrayQueue[i];
                arrayQueue[i - 1] = tmp;
            }
        }
        arrayQueue[rear] = null;
        rear--;
        items--;
    }

    public boolean isFull(){
        return (items == maxSize);
    }

    public boolean isEmpty(){
        return (items == 0);
    }

    public void printQueue(){
        for (int i = 0; i < arrayQueue.length; i++){
            System.out.println(arrayQueue[i]);
        }

    }
}
