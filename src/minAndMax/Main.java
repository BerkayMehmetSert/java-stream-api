package minAndMax;

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

        // Find the minimum and maximum values in the list -> Listeden en küçük ve en büyük değerleri bulunuz.
        int min = list.stream().min(Comparator.naturalOrder()).get();
        int max = list.stream().max(Comparator.naturalOrder()).get();

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
