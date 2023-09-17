package org.HashMap;

public class MyHashMap<K, V> {
    Node<K, V> first;
    Node<K, V> last;


    public void put(Object key, Object value) {
        Node<K, V> newNode = new Node<>((K) key, (V) value, null);
        Node<K, V> f = first;
        Node<K, V> l = first;
        if (f == null) {
            first = newNode;
        }else {
            while (l.next != null) {
                if (l.key.equals((K) key)) {
                    l = newNode;
                    break;
                } else l = l.next;
            }
            l.next = newNode;
        }
    }

    public void remove(Object key){
        Node<K, V> f = first;
        while (f != null){
            if (f.key.equals((K) key)){
                f.key = null;
                f.value = null;
                f = f.next;
            }
            f = f.next;
        }
    }

    public int size(){
        int counter = 1;
        Node<K, V> f = first;
        if (f == null){
            return 0;
        }
        while (f.next != null){
            f = f.next;
            counter++;
        }
        return counter;
    }

    public void clear() {
        Node<K, V> f = first;

            while (f.next != null) {
                Node<K, V> next = f.next;
                f.key = null;
                f.value = null;
                f.next = null;
                f = next;
            }
            first = last = null;
        }

        public V get(Object key){
        Node<K, V> f = first;
        if (f == null){
            return null;
        }
        while (f.next != null){
            if (f.key.equals((K) key)){
                break;
            }f = f.next;
        }
        return f.value;
        }


        static class Node<K, V> {

            K key;
            V value;
            Node<K, V> next;

            Node(K key, V value, Node<K, V> next) {
                this.key = key;
                this.value = value;
                this.next = next;
            }
        }
    }
