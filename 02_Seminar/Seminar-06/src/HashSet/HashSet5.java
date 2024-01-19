package HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet5 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("cherry");

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("cherry");

        boolean containsAll = set.containsAll(fruits);
        System.out.println("Contains all fruits? " + containsAll); // Выведет: Contains all fruits? true
    }
}
