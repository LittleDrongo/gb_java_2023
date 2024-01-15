package Tast2;

import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {
        // Создаем ArrayList для хранения строк
        ArrayList<String> fruits = new ArrayList<>();

        ArrayList<String> additionalFruits = new ArrayList<>();

        // Добавляем элементы в конец списка
        fruits.add("Яблоко");
        fruits.add("Банан");
        fruits.add("Апельсин");

        // Добавляем элементы во второй список
        additionalFruits.add("Груша");
        additionalFruits.add("Вишня");

        fruits.addAll(additionalFruits);

        // Выводим список
        System.out.println("Список после добавления элементов: " + fruits);

        // Добавляем новый элемент в конец списка
        fruits.add("Груша");

        fruits.add(1, "apple");

        // Выводим обновленный список
        System.out.println("Список после добавления нового элемента: " + fruits);
    }
}