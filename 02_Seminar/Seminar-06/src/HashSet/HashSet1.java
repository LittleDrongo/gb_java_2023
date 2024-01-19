package HashSet;

import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice"); // Дубликаты не добавятся

        System.out.println(names); // Выведет: [Alice, Bob, Charlie]

        names.remove("Alice"); // Удаляем элемент 10
        System.out.println(names); // Выведет: [5, 15]


        boolean containsCharlie = names.contains("Charlie");
        System.out.println("Contains Charlie: " + containsCharlie); // Выведет: Contains Charlie: true

        boolean empty = names.isEmpty();
        System.out.println("Is the set empty? " + empty); // Выведет: Is the set empty? true

        int namesCount = names.size();
        System.out.println("Number of names: " + namesCount); // Выведет: Number of names: 5

    }
}
