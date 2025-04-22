public class MyCircularQueue {

    Node[] array;
    int headPointer = 0;
    int tailPointer = 0;

    public MyCircularQueue(int k) {
        array = new Node[k];
    }

    public boolean enQueue(int value) {
        if (isFull()) return false;

        Node newNode = new Node(value, null);
        if (array[headPointer] == null) {
            array[headPointer] = newNode;
        } else {
            array[tailPointer].next = newNode;
            tailPointer = (tailPointer + 1) % array.length;
            array[tailPointer] = newNode;
        }
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) return false;
        array[headPointer] = null;
        headPointer = (headPointer + 1) % array.length;
        if (array[headPointer] == null) {
            tailPointer = headPointer;
        }
        return true;
    }

    public int Front() {
        if (isEmpty()) return -1;
        return array[headPointer].item;
    }

    public int Rear() {
        if (isEmpty()) return -1;
        return array[tailPointer].item;
    }

    public boolean isEmpty() {
        for (Node node : array) {
            if (node != null) return false;
        }
        return true;
    }

    public boolean isFull() {
        for (Node node : array) {
            if (node == null) return false;
        }
        return true;
    }

    private static class Node {
        int item;
        Node next;

        Node(int item, Node next) {
            this.item = item;
            this.next = next;
        }
    }
}
