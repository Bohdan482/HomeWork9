package org.LinkedList;

public class MyLinkedList<E> {
    int size = 0;
    Node<E> first;
    Node<E> last;

    public void add(Object value){
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l, (E)value, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }

    public int size(){
        return size;
    }

    public void clear(){
        Node<E> f = first;
        while ( f != null) {
            Node<E> next = f.next;
            f.item = null;
            f.next = null;
            f.prev = null;
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
        x.item = null;
        if (index < size - 1 && x.next != null) {
            for (int i = index; i < size - 1; i++) {
                x.item = x.next.item;
            }
        }
        size--;
    }

    public E get(int index){
        Node<E> result = first;
         if (index < (size >> 1)) {
            Node<E> current = first;
            for (int i = 0; i < index; i++) {
                current = current.next;
           }
        } else {
            Node<E> current = last;
            for (int i = size - 1; i > index; i--)
                current = current.prev;
            result = current;
        }
        return result.item;
    }

    public static class Node<E>{
        E item;
        Node<E> next;
        Node<E> prev;
        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
