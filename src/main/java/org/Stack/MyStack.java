package org.Stack;

public class MyStack<E> {
    int size = 0;
    Node<E> first;
    Node<E> last;
    public void add(Object value) {
        Node<E> l = last;
        Node<E> newNode = new Node<>((E) value, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        }else
            l.next = newNode;
        size++;
    }

    public int size(){
        return size;
    }


    public E peek() {
        Node<E> f = first;
        return f.element;
    }

    public E pop(){
        Node<E> f = first;
        E value = f.element;
        Node<E> next = f.next;
        f.element = null;
        first = next;
        size--;
        return value;
    }

    public void clear(){
        Node<E> f = first;
        while ( f != null) {
            Node<E> next = f.next;
            f.element = null;
            f.next = null;
            f = next;
        }
        first = last = null;
        size = 0;
    }

    public void remove(int index) {
        Node<E> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        x.element = null;
        if (index < size - 1 && x.next != null) {
            for (int i = index; i < size - 1; i++) {
                    x.element = x.next.element;
                }
            }
            size--;
    }

    public static class Node<E>{
        E element;
        Node<E> next;

        public Node(E value, Node<E> next) {
            this.element = value;
            this.next = next;
        }
    }
}
