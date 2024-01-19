package HashSet;

import java.util.HashSet;

public class HashSet2 {
    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println("Before clear: " + numbers); // Выведет: Before clear: [1, 2, 3]

        numbers.clear(); // Очищаем множество

        System.out.println("After clear: " + numbers); // Выведет: After clear: []
    }
}
