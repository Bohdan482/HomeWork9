package org.HashMap;

public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        myHashMap.put("Roma", 25);
        myHashMap.put("Ivan", 35);
        myHashMap.put("Roma", 45);
        myHashMap.put("Gary", 15);

        myHashMap.remove("Ivan");
        System.out.println(myHashMap.size());

    }
}
