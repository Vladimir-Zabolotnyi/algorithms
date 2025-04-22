import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {

    int counter;
    Queue<Integer> queue;


    public RecentCounter() {
        counter = 0;
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        if (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int element = queue.peek();
                if (element < t - 3000) {
                    queue.poll();
                }
            }
        }
        queue.add(t);
        return queue.size();
    }
}
