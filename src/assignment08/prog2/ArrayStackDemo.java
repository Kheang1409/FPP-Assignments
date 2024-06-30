package assignment08.prog2;

import static java.lang.StringTemplate.STR;

public class ArrayStackDemo {
    Node header;

    public ArrayStackDemo(){
        header = new Node();
    }

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = header.next;
        header.next = newNode;
        newNode.previous = header;
    }

    public int pop(){
        if(isEmpty()) return -1;
        Node deleteItem = header.next;
        if(header.next.next != null){
            header.next = header.next.next;
        }
        else{
            header.next = null;
        }
        return deleteItem.data;
    }

    public int peek(){
        if(isEmpty()) return -1;
        return header.next.data;
    }

    public boolean isEmpty(){
        return header.next == null;
    }

    @Override
    public String toString(){
        if(isEmpty()) return "Empty Stack";
        StringBuilder s = new StringBuilder("Stack Top (Exit)\n");
        Node currentNode = header.next;
        while(currentNode != null){
            s.append(STR."""
                        |\t\{currentNode.data}\t|
                        """);
            currentNode = currentNode.next;
        }
        s.append("Stack Bottom (Dead~End)\n");
        return s.toString();
    };

    class Node{
        Integer data;
        Node next;
        Node previous;
        public Node(){
        }
        public Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        ArrayStackDemo demo = new ArrayStackDemo();
        demo.push(1);
        demo.push(2);
        System.out.println(demo);
        System.out.println(demo.pop() + " out!"); //pop 2 because it last in;
        System.out.println(demo);
        demo.push(3);
        demo.push(4);
        demo.push(5);
        demo.push(6);
        System.out.println(demo.peek() + " Top item!"); //top item is 6 because it last in;
        System.out.println(demo);


    }
}
