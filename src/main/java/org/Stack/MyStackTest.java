package org.Stack;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();

        myStack.add("Stack");
        myStack.add("much");
        myStack.add("as");
        myStack.add("like");
        myStack.add("queue.");
        myStack.remove(2);
    }
}
