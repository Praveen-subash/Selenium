package com.Collections;

import java.util.PriorityQueue;

public class PriorityQueueSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		
		// Adding items to the pQueue using add()
//        pQueue.add(40);
//        pQueue.add(20);
//        pQueue.add(35);
//		
		// Adding items to the pQueue using add()
        pQueue.offer(10);
        pQueue.offer(20);
        pQueue.offer(15);
        pQueue.offer(13);
        
        //Always least element is the head of the queue. Others are based on priority heap
        //once a element is removed least elemet is moved to head of the queue
        
        System.out.println(pQueue);
        
        // return head element of the queue
        System.out.println("peek --> "+pQueue.peek());
 
        // Remove and return head element of the queue
        System.out.println("Poll --> "+pQueue.poll());
 
        // return head element of the queue
        System.out.println(pQueue.peek());

	}

}
