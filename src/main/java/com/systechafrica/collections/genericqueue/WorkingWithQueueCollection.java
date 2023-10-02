package com.systechafrica.collections.genericqueue;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueueCollection {

  public static void main(String[] args) {
    workingwithQueues();
  }

  public static void workingwithQueues() {
    Queue<PrintJob> queue = new LinkedList<>();

    queue.add(new PrintJob("articles")); // throws an exception
    // queue.offer(new PrintJob("articles")); return true or false
    queue.add(new PrintJob("books"));
    queue.add(new PrintJob("journal"));

    System.out.println(queue);

    // shows first element or front
    System.out.println(queue.size());
    // System.out.println(queue.element()); //throws an exception
    System.out.println(queue.peek()); // retuen null

    // remove element
    System.out.println(queue.remove()); // throw an exception
    System.out.println(queue.poll()); // returns null if empty

    // current queue
    System.out.println(queue);

  }

}
