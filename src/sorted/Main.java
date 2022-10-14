package sorted;

import java.util.ArrayList;
import java.util.Comparator;
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

        // Sort the list -> küçükten büyüğe doğru sıralar
        list.stream().sorted().forEach(number -> System.out.println(number));

        System.out.println("====================");

        // Sort the list in reverse order -> büyükten küçüğe doğru sıralar
        list.stream().sorted(Comparator.reverseOrder()).forEach(number -> System.out.println(number));
    }
}
