package assignment10.prog3.queue;

import java.util.NoSuchElementException;
import java.util.Queue;

// User Implementation of Queue
class LinkedQueue {
	class Node {
		Object data;
		Node next;

		Node(Object item){
		// constructor
			data = item;
		}
	}

	Node front, rear;
	int count;

	public void insert(Object item) {
		Node p = new Node(item);
		if (front == null){
		// queue is empty; insert first item
			front = rear = p;
			front.next = null;
		}
		if (front == rear){
		// queue contains one item; insert second item
			rear = p;
			front.next = rear;
			rear.next = null;
		}
		else{
		// queue contains 2 or more items
			rear.next = p;
			// old rear.next refers to p
			rear = p;
			// new rear refers to p
			rear.next = null;
		}
		count++;
		// increment queue size
	}

	public Object remove() {
		if (isEmpty()) throw new NoSuchElementException("Queue is empty");
		Object item = front.data;
		front = front.next;
		count--;
		// decrement queue size
		return item;
	}

	public boolean isEmpty() {
		/*if(front == null) return true;
		else false;*/
		return (front == null);
	}

	public Object peek() {
		if (isEmpty()) {
			System.out.println("Q is empty, cannot peek element ");
			return null;
		}
		return front.data;
	}

	public int size() {
		return count;
	}

	public void display() {
		Node p = front;
		System.out.print("Linked Q: ");
		if (p == null)
			System.out.println("empty");
		while (p != null) {
			System.out.print(p.data + " ");
			p = p.next;
		}
		System.out.println();
	}
}

public class LinkedQueueDemo {
	public static void main(String[] args) {
		LinkedQueue q = new LinkedQueue();
		q.display();
		q.insert('A');
		q.insert('B');
		q.insert('C');
		q.insert('D');
		q.display();
		System.out.println("Remove(): " + q.remove());
		q.display();
		System.out.println("peek(): " + q.peek());
		q.insert('E');
		q.insert('F');
		System.out.println("Remove(): " + q.remove());
		q.display();
		System.out.println("size(): " + q.size());
		System.out.println("isEmpty(): " + q.isEmpty());
		LinkedQueue q1 = new LinkedQueue();
		System.out.println("isEmpty(): " + q1.isEmpty());
	}
}
