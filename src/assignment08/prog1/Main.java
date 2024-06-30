package assignment08.prog1;

public class Main {
    public static void main(String[] args) {
        //Resize
        //Reuse Free Memory
        ArrayQueueImpl myQueue = new ArrayQueueImpl();
        System.out.println("Is Empty: " + myQueue.isEmpty());
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        System.out.println("Dequeue: " + myQueue.dequeue());
        System.out.println("Dequeue: " + myQueue.dequeue());
        System.out.println(myQueue + " size:" + myQueue.size());
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        myQueue.enqueue(6);
        myQueue.enqueue(7);
        myQueue.enqueue(8);
        myQueue.enqueue(9);
        myQueue.enqueue(10);
        System.out.println(myQueue + " size:" + myQueue.size());
        System.out.println("Peek: " + myQueue.peek());
        System.out.println("Dequeue: " + myQueue.dequeue());
        System.out.println("Dequeue: " + myQueue.dequeue());
        System.out.println(myQueue + " size:" + myQueue.size());
        myQueue.enqueue(11);
        myQueue.enqueue(12);
        System.out.println(myQueue + " size:" + myQueue.size());
        myQueue.enqueue(13);
        myQueue.enqueue(14);
        myQueue.enqueue(15);
        myQueue.enqueue(16);
        System.out.println("Peek: " + myQueue.dequeue());
        System.out.println("Peek: " + myQueue.dequeue());
        myQueue.enqueue(17);
        myQueue.enqueue(18);
        myQueue.enqueue(19);
        myQueue.enqueue(20);
        System.out.println("Peek: " + myQueue.dequeue());
        System.out.println("Peek: " + myQueue.dequeue());
        System.out.println("Peek: " + myQueue.dequeue());

        System.out.println(myQueue + " size:" + myQueue.size());
    }
}
