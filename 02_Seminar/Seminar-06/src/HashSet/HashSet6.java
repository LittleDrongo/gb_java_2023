package HashSet;

import java.util.HashSet;

public class HashSet6 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);

        set1.removeAll(set2); // Удаляем из set1 все элементы, которые есть в set2

        System.out.println("After removal: " + set1); // Выведет: After removal: [1]
    }
}
