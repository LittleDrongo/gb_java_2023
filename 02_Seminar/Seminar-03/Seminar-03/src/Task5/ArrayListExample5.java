package Task5;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample5 {
    public static void main(String[] args) {
        // Создаем ArrayList для хранения строк
        ArrayList<String> fruits = new ArrayList<>();

        // Добавляем элементы в список
        fruits.add("Яблоко");
        fruits.add("Банан");
        fruits.add("Апельсин");

        // Выводим список до замены
        System.out.println("Список до замены: " + fruits);

        // Заменяем элемент по индексу 1 (второй элемент) на "Груша"
        fruits.set(1, "Груша");

        // Выводим обновленный список
        System.out.println("Список после замены элемента по индексу: " + fruits);

        // Получаем размер списка
        int size = fruits.size();

        // Выводим размер списка
        System.out.println("Размер списка: " + size);

        // Добавляем элементы в список
        fruits.add("Яблоко");
        fruits.add("Банан");
        fruits.add("Апельсин");
        fruits.add("Груша");
        fruits.add("Вишня");

        // Выводим обновленный список
        System.out.println("Список после замены элемента по индексу: " + fruits);

        // Создаем подсписок, начиная с индекса 1 (второй элемент) и заканчивая индексом 3 (четвертый элемент)
        List<String> sublist = fruits.subList(1, 4);

        // Выводим подсписок
        System.out.println("Подсписок элементов: " + sublist);
    }
}