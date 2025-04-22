import org.junit.jupiter.api.Test;


class MyCircularQueueTest {

    @Test
    void enqueue() {
        MyCircularQueue queue = new MyCircularQueue(6);
        queue.enQueue(6);
        queue.isEmpty();
        queue.Rear();
        queue.Rear();
        queue.deQueue();
        queue.enQueue(5);
        queue.Rear();
        queue.deQueue();
        queue.Front();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();


    }

}