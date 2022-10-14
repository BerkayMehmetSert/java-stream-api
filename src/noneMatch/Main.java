package noneMatch;

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

        // Check if none of the elements in the list are greater than 100 -> Listenin hiçbir elemanı 100'den büyük mü?
        boolean result = list.stream().noneMatch(number -> number > 100);
        System.out.println(result);

        // Check if none of the elements in the list are greater than 0 -> Listenin hiçbir elemanı 0'dan büyük mü?
        boolean result2 = list.stream().noneMatch(number -> number > 0);
        System.out.println(result2);
    }
}
