package distinct;

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

        // Her eleman en fazla bir kez bulunmasını sağlar.
        list.stream().distinct().forEach(number -> System.out.println(number)); // 25 bir kere yazdırılır.
    }
}
