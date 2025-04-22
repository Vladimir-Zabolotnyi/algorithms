package hash;

import java.util.Arrays;

public class MyHashSet {

    int[] array;

    public MyHashSet() {
        array = new int[10*10*10*10*10*10*10];
        Arrays.fill(array, -1);
    }

    public void add(int key) {
        array[hashFunction(key)] = key;
    }

    public void remove(int key) {
        try {
            array[hashFunction(key)] = -1;
        } catch (Exception ignored) {

        }
    }

    public boolean contains(int key) {
        return array[hashFunction(key)] == key;
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