package data_structures.stack;

public class OurStack {

    int maxSize;
    Object[] stackArray;
    int top;

    public OurStack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new Object[this.maxSize];
        this.top = -1 ;

    }

    public void push(Object data){
        if (isFull()){
            System.out.println("Stack is full");
        } else {
            top += 1;
            stackArray[top] = data;
        }
    }

    public void pop(){
        if (isEmpty()){
            System.out.println("Stack is empty");
        }else {
            top -= -1 ;
        }
    }

    public boolean isFull(){
        return (top == maxSize - 1);
    }

    public boolean isEmpty(){
        return (top == -1);
    }
}
