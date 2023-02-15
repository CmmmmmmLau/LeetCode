package Array.$989_Add_to_Array_Form_of_Integer;

import java.util.ArrayList;
import java.util.List;

public class solution_final {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int length = num.length - 1;

        while (length >= 0 || k > 0){
            result.add(0, (length >= 0 ? (num[length] + k) : k) % 10);
            k = (length >= 0 ? (num[length--] + k) : k) / 10;
        }
        return result;
    }
}
