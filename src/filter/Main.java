package filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

        // List elements can be filtered using filter() method
        List<Integer> filteredList = list.stream().filter(number -> number > 25).collect(Collectors.toList());
        System.out.println(filteredList);

    }
}
