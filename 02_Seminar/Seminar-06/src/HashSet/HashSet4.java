package HashSet;

import java.util.HashSet;

public class HashSet4 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);

        set1.addAll(set2); // Добавляем все элементы из set2 в set1

        System.out.println("Combined set: " + set1); // Выведет: Combined set: [1, 2, 3]
    }
}
