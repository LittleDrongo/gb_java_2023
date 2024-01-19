package TreeSet;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSet2 {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        // Добавляем элементы в TreeSet
        numbers.add(10);
        numbers.add(5);
        numbers.add(15);
        numbers.add(3);
        numbers.add(7);

        // floor(E e): Возвращает наибольший элемент, который меньше или равен заданному элементу
        int floorForEight = numbers.floor(8);
        System.out.println("Floor for 8: " + floorForEight); // Выведет: Floor for 8: 7

        // descendingSet(): Возвращает обратное представление набора элементов
        TreeSet<Integer> descendingNumbers = (TreeSet<Integer>) numbers.descendingSet();
        System.out.println("Descending Set: " + descendingNumbers); // Выведет: Descending Set: [15, 10, 7, 5, 3]

        // headSet(E toElement): Возвращает набор элементов, которые меньше заданного элемента toElement
        TreeSet<Integer> headSet = (TreeSet<Integer>) numbers.headSet(7);
        System.out.println("Head Set (less than 7): " + headSet); // Выведет: Head Set (less than 7): [3, 5]

        // tailSet(E fromElement): Возвращает набор элементов, которые больше или равны заданному элементу fromElement
        TreeSet<Integer> tailSet = (TreeSet<Integer>) numbers.tailSet(7);
        System.out.println("Tail Set (greater than or equal to 7): " + tailSet); // Выведет: Tail Set (greater than or equal to 7): [7, 10, 15]

        // subSet(E fromElement, E toElement): Возвращает набор элементов, начиная с элемента fromElement и заканчивая элементом toElement
        TreeSet<Integer> subSet = (TreeSet<Integer>) numbers.subSet(5, 10);
        System.out.println("Sub Set (between 5 and 10): " + subSet); // Выведет: Sub Set (between 5 and 10): [5, 7]
        // 1 2 3 4 [5 6 7 8 9] 10 11 12 13 14 15 16 17 18 19

        ArrayList<Integer> tailList = new ArrayList<>(numbers.tailSet(7));
        System.out.println("Tail List (greater than or equal to 7): " + tailList);
    }
}
