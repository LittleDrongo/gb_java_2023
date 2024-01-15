package Task6;

import java.util.ArrayList;

public class ArrayListExample7 {
    public static void main(String[] args) {
        // Создаем ArrayList для хранения строк
        ArrayList<ArrayList<String>> fruits0 = new ArrayList<>();
        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<String> fruits2 = new ArrayList<>();

        // Добавляем элементы в список
        fruits.add("Яблоко");
        fruits.add("Банан");
        fruits.add("Апельсин");

        // Добавляем элементы в список
        fruits2.add("Яблоко2");
        fruits2.add("Банан2");
        fruits2.add("Апельсин2");


        fruits0.add(fruits);
        fruits0.add(fruits2);

        // Получаем строковое представление списка
        // String fruitsString = fruits.toString();
        // String fruitsString2 = fruits2.toString();

        // Выводим строковое представление
        System.out.println("Строковое представление списка: " + fruits0);
    }
}