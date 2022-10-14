package map;

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

        // Multiply each element by 2 -> Her elemanı 2 ile çarp
        list.stream().map(number ->number*2).forEach(number -> System.out.println(number));

        System.out.println("====================================");

        // Take the square root of each element -> Her elemanın karekökünü al ve double olarak yazdır
        list.stream().map(number ->Math.sqrt(number)).forEach(number -> System.out.println(number));

    }
}

