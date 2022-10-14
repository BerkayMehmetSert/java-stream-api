package allMatch;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(12);
        list.add(3);
        list.add(89);
        list.add(25);
        list.add(44);
        list.add(100);
        list.add(7);
        list.add(63);

        // Check if all elements are greater than 100 -> tüm elemanlar 100'dan büyük mü?
        boolean result = list.stream().allMatch(number -> number > 100);
        System.out.println(result);

        // Check if all elements are greater than 0 -> tüm elemanlar 0'dan büyük mü?
        boolean result2 = list.stream().allMatch(number -> number > 0);
        System.out.println(result2);
    }
}
