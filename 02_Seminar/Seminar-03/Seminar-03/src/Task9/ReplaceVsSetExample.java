package Task9;

import java.util.ArrayList;

public class ReplaceVsSetExample {
    public static void main(String[] args) {
        // Создаем ArrayList с некоторыми значениями
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Яблоко");
        fruits.add("Банан");
        fruits.add("Апельсин");

        // Используем пользовательский метод replace для замены элемента "Банан" на "Груша"
        replace(fruits, "Банан", "Груша");

        // Используем стандартный метод set для замены элемента "Апельсин" на "Вишня"
        fruits.set(2, "Вишня");

        // Выводим результат
        System.out.println("Список фруктов после замен: " + fruits);
    }

    // Пользовательский метод replace для замены элемента в ArrayList
    public static <E> void replace(ArrayList<E> list, E oldElement, E newElement) {
        int index = list.indexOf(oldElement);
        if (index != -1) {
            list.set(index, newElement); // Используем стандартный метод set для замены
        }
    }
}