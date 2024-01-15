package seminar4.Task5;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        // Примеры использования методов для работы с двусторонней очередью

        // Добавление элементов в начало и конец очереди
        deque.addFirst("Элемент 1");
        deque.addLast("Элемент 2");
        deque.offerFirst("Элемент 0");
        deque.offerLast("Элемент 3");

        // Удаление и получение элементов из начала и конца очереди
        String firstRemoved = deque.removeFirst();
        String lastRemoved = deque.removeLast();
        String firstPolled = deque.pollFirst();
        String lastPolled = deque.pollLast();

        System.out.println("Удален первый элемент: " + firstRemoved);
        System.out.println("Удален последний элемент: " + lastRemoved);
        System.out.println("Получен первый элемент (после удаления): " + firstPolled);
        System.out.println("Получен последний элемент (после удаления): " + lastPolled);

        // Получение элементов из начала и конца очереди без удаления
        String firstElement = deque.getFirst();
        String lastElement = deque.getLast();

        System.out.println("Первый элемент (без удаления): " + firstElement);
        System.out.println("Последний элемент (без удаления): " + lastElement);
    }
}