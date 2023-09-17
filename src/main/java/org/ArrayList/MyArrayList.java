package org.ArrayList;

public class MyArrayList<T> {
    private static final int DEFOULT_CAPATHITY = 10;
    private T[] data;
    private int size;
    public MyArrayList() {
        data = (T[]) new Object[DEFOULT_CAPATHITY];
        size = 0;
    }
    public void add(T value) {
       if (size >= data.length) {
        data = (T[]) new Object[data.length + 1];
       }
           data[size] = value;
           size++;
    }

    public T[] remove (int index){
        T[] result = (T[]) new Object[data.length - 1];
        for (int i = 0; i < index; i++){
            result[i] = data[i];
        }
        int j = index;
        for (int i = index + 1; i < data.length; i++){
            result[j] = data[i];
        }
        return result;
    }
    public T[] clear(){
        for (int i = 0; i < data.length; i++){
            data[i] = null;
        }
        return data;
    }

    public int size(){
        return data.length;
    }

    public T get(int index){
        if (index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException();
        }
        return data[index];
    }
}