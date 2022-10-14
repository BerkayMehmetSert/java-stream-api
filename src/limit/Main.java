package limit;

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

        // Limit the list to the first 5 elements -> ilk 5 elemanı alır
        list.stream().limit(5).forEach(number -> System.out.println(number));
    }
}
