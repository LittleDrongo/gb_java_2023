package Task6;

import java.util.ArrayList;

public class ArrayListExample6 {
    public static void main(String[] args) {
        // Создаем ArrayList для хранения строк
        ArrayList<String> fruits = new ArrayList<>();

        // Добавляем элементы в список
        fruits.add("Яблоко");
        fruits.add("Банан");
        fruits.add("Апельсин");

        // Преобразуем список в массив
        String[] fruitsArray = fruits.toArray(new String[fruits.size()]);

        // Выводим массив
        for (String fruit : fruitsArray) {
            System.out.println(fruit);
        }
    }
}