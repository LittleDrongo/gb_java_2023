package Task1;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Создаем объект ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // Добавляем элементы
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Получаем элемент по индексу
        int secondNumber = numbers.get(1);
        System.out.println("Второй элемент: " + secondNumber);

        // Изменяем элемент по индексу
        numbers.set(0, 5);
        System.out.println("Измененный список: " + numbers);

        // Удаляем элемент по индексу
        numbers.remove(2);
        System.out.println("После удаления элемента: " + numbers);

        // Проверяем наличие элемента
        boolean containsTwenty = numbers.contains(20);
        System.out.println("Содержит 20: " + containsTwenty);
    }
}