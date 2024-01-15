package Task8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListRemoveAll {
    public static void main(String[] args) {
        // Создаем ArrayList для хранения чисел
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Создаем коллекцию для удаления элементов
        List<Integer> toRemove = Arrays.asList(2, 4, 6);

        // Удаляем из списка все элементы, которые содержатся в коллекции toRemove
        numbers.removeAll(toRemove);

        // Выводим результат
        System.out.println("Список после удаления элементов: " + numbers);



        // Создаем коллекцию с элементами, которые хотим оставить
        List<Integer> toRetain = Arrays.asList(2, 4, 6);

        // Оставляем в списке только элементы, которые содержатся в коллекции toRetain
        numbers.retainAll(toRetain);

        // Выводим результат
        System.out.println("Список после оставления элементов: " + numbers);
    }
}