package anyMatch;

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

        // Check if any element is greater than 100 -> listedeki herhangi bir eleman 100'den büyük mü? Tek bir eleman bile 100'den büyükse true döner
        boolean result = list.stream().anyMatch(number -> number > 100);
        System.out.println(result);

        // Check if any element is less than 10 -> listedeki herhangi bir eleman 10'dan küçük mü? Tek bir eleman bile 10'dan küçükse true döner
        boolean result2 = list.stream().anyMatch(number->number<10);
        System.out.println(result2);
    }
}