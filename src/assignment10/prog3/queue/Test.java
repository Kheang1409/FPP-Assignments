package assignment10.prog3.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Queue<Integer> pq = new PriorityQueue<Integer>();
	        pq.add(25);
	        pq.add(15);
	        pq.add(35);
	        pq.add(30);
	        pq.add(11);
	     //   System.out.println("Priority Queue Elements : " + pq);
	        Iterator<Integer> p = pq.iterator();
	        System.out.println("Elements removed according to the priority : ");
	        while(p.hasNext()){
				System.out.print(STR."\{pq.remove()}  ");
	        }
	}

}
