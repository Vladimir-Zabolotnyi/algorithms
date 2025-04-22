import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByPowerValue {

    private static final Comparator<Integer> customComparator = new Comparator<Integer>() {
        @Override
        public int compare(Integer first, Integer second) {
            return getPowerValue(first) - getPowerValue(second);
        }

        private int getPowerValue(int number) {
            var counter = 0;
            var powerValue = number;
            while (powerValue != 1) {
                if (powerValue % 2 == 0) {
                    powerValue = powerValue / 2;
                } else powerValue = 3 * powerValue + 1;
                counter++;
            }
            return counter;
        }
    };

    public int getKth(int lo, int hi, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = lo; i <= hi; i++) {
            list.add(i);
        }
        Collections.sort(list, customComparator);
        return list.get(k - 1);
    }
}
