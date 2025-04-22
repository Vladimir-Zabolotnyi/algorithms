import java.util.ArrayList;
import java.util.List;

class MinStack {

    List<Integer> stack;
    int fistElementIndex;

    public MinStack() {
        stack = new ArrayList<>();
        fistElementIndex = -1;
    }

    public void push(int val) {
        stack.add(val);
        fistElementIndex++;
    }

    public void pop() {
        if (fistElementIndex >= 0) {
            stack.remove(fistElementIndex);
            fistElementIndex--;
        }
    }

    public int top() {
        return stack.get(fistElementIndex);
    }

    public int getMin() {
        int min = stack.get(0);
        for (int i = 1; i < fistElementIndex + 1; i++) {
            if (min > stack.get(i)) {
                min = stack.get(i);
            }
        }
        return min;
    }
}