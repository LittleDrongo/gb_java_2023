package Task9;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListReplaceAllExample {
    public static void main(String[] args) {
        // Создаем ArrayList с числами
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Заменяем каждый элемент на его квадрат
        numbers.replaceAll(n -> n + 5);

        // Выводим результат
        System.out.println("Список после замены элементов: " + numbers);
    }
}