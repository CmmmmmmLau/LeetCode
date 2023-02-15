package Array.$989_Add_to_Array_Form_of_Integer;

import java.util.ArrayList;
import java.util.List;

public class solution1 {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        for (int i = num.length - 1; i >= 0; i--){
            result.add(0, (num[i] + k) % 10);
            k = (num[i] + k) / 10;
        }
        while (k > 0){
            result.add(0, k % 10);
            k /= 10;
        }
        return result;
    }
}
