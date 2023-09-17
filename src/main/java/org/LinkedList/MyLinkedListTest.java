package org.LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("Start");
        myLinkedList.add("of");
        myLinkedList.add("my");
        myLinkedList.add("LinkedList.");

        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.get(2));
        myLinkedList.remove(2);
        System.out.println(myLinkedList.get(2));
        myLinkedList.clear();
        System.out.println(myLinkedList.size());
    }
}
