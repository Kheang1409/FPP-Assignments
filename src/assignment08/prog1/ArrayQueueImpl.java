package assignment08.prog1;

public class ArrayQueueImpl {
    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;

    public boolean isEmpty(){
        return front == -1 || rear < front;
    }
    public int size(){
        if(isEmpty()) return 0;
        if(front > rear) return 0;
        return (rear-front)+1;
    }
    public void enqueue(int item){
        if(isEmpty()){
            front = rear = 0;
            arr[front] = item;
        }
        else{
            if(rear == arr.length-1){
                resize();
            }
            rear = rear + 1;
            arr[rear] = item;
        }
    }
    public int dequeue(){
        if(isEmpty()) return -1;
        int delete = peek();
        front = front + 1;
        return delete;
    }
    public int peek(){
        if(isEmpty()) return -1;
        return arr[front];
    }

    private void resize(){
        int[] temp = new int[size()*2];
        System.arraycopy(arr, front, temp, front, rear-front+1);
        arr = temp;
    }

    @Override
    public String toString(){
        if(isEmpty()) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for(int i = front; i <= rear; i++){
            sb.append(arr[i]);
            if(i != rear) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
