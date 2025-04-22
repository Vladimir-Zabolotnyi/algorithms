package hash;

import java.util.ArrayList;
import java.util.List;

public class FirstDuplicated {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) result.add(index + 1);

            nums[index] *= -1;
        }

        return result;
    }
}
