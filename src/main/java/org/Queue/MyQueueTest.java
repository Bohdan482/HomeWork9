package org.Queue;


import java.util.Arrays;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<String> myQueue = new MyQueue<>();
        myQueue.add("Collections");
        myQueue.add("are");
        myQueue.add("not");
        myQueue.add("easy!");

        System.out.println(myQueue.size());
        System.out.println(myQueue.peek());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.size());
        myQueue.clear();
        System.out.println(myQueue.size());

    }
}
