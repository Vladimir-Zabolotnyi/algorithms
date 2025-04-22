package hash;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class MyHashSetTest {

    @Test
    void test() {
        MyHashSet hashSet = new MyHashSet();

        hashSet.add(1);
        hashSet.add(2);
        hashSet.contains(1);
    }

}