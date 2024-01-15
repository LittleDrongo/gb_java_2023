package Task1;
import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Создаем объект списка с использованием интерфейса List
        List<String> fruits = new ArrayList<>();

        // Добавляем элементы в список
        fruits.add("Яблоко");
        fruits.add("Банан");
        fruits.add("Апельсин");

        // Получаем размер списка
        int size = fruits.size();
        System.out.println("Размер списка: " + size);

        // Получаем элемент по индексу
        String firstFruit = fruits.get(0);
        System.out.println("Первый элемент: " + firstFruit);

        // Перебираем элементы списка
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Удаляем элемент по значению
        fruits.remove("Банан");
        System.out.println("После удаления 'Банана': " + fruits);
    }
}