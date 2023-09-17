package org.ArrayList;

import java.util.Arrays;

public class ArrayListTest {
    public static void main(String[] args) {
        MyArrayList <Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(358);
        myArrayList.add(55);
        myArrayList.add(12);
        myArrayList.add(56);


//        System.out.println(myArrayList.get(0));
//        System.out.println(Arrays.toString(myArrayList.clear()));
//        System.out.println(myArrayList.size());
        System.out.println(Arrays.toString(myArrayList.remove(1)));

    }
}
