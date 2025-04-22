package hash;

import java.util.Arrays;

public class MyHashMap {

    int[] array;

    public MyHashMap() {
        array = new int[10 * 10 * 10 * 10 * 10 * 10 * 10];
        Arrays.fill(array, -1);
    }

    public void put(int key, int value) {
        array[hashFunction(key)] = value;
    }

    public int get(int key) {
        return array[hashFunction(key)];
    }

    public void remove(int key) {
        try {
            array[hashFunction(key)] = -1;
        } catch (Exception ignored) {

        }
    }

    private int hashFunction(int key) {
        return key + 1;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */