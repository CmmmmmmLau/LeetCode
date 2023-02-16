package Array.$989_Add_to_Array_Form_of_Integer;

import java.util.LinkedList;

public class solution_old {
    public static void main(String[] args) {
        int num[] = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int k = 1;
        LinkedList<Integer> result = new LinkedList<>();
        int temp = 0;

        for (int i = 0; i < num.length; i++) {
            temp += num[i] * Math.pow(10, num.length - i - 1);
        }

        int sum = temp + k;
        char array[] = String.valueOf(sum).toCharArray();

        for (int i = 0; i < array.length; i++) {
            result.addLast(Integer.parseInt(String.valueOf(array[i])));
        }
    }
}
