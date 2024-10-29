// Interface Queue<E>

// https://docs.oracle.com/javase/8/docs/api/index.html?java/util/Queue.html

import java.util.Queue;
import java.util.LinkedList;

class Filo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        
        queue.add("Banana");
        queue.add("Pear");
        queue.add("Apple");
        System.out.println(queue);
        
        // remove() NoSuchElementException - if this queue is empty
        queue.remove();
        System.out.println(queue);
        
        // poll() the head of this queue, or null if this queue is empty
        // queue.poll();
        // System.out.println();
        
        queue.add("BlueBerry");
        System.out.println(queue);
        
        // peek() the head of this queue, or null if this queue is empty
        System.out.println(queue.peek());
        
        // element() NoSuchElementException - if this queue is empty
        // System.out.println(queue.element());
        
    }
}