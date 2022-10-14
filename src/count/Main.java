package count;

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

        // Count the number of elements in the list -> listedeki eleman sayısını sayar
        Long count = list.stream().count();
        System.out.println(count);

        // 50'den büyük olan eleman sayısını sayar
        Long count2 = list.stream().filter(number -> number > 50).count();
        System.out.println(count2);
    }


}
