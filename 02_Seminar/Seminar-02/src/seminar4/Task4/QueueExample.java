package seminar4.Task4;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Примеры использования методов для работы с очередью

        // 1. Добавление элемента в конец очереди с помощью add(element)
        queue.add("Элемент 1");
        queue.add("Элемент 2");
        queue.add("Элемент 3");

        // 2. Добавление элемента в конец очереди с помощью offer(element)
        boolean offered = queue.offer("Элемент 4");

        System.out.println("Добавлен элемент 4 с использованием offer(): " + offered);

        // 3. Удаление и получение элемента из начала очереди с помощью remove()
        String removedElement = queue.remove();

        System.out.println("Удаленный элемент из начала очереди с remove(): " + removedElement);

        // 4. Удаление и получение элемента из начала очереди с помощью poll()
        String polledElement = queue.poll();

        System.out.println("Удаленный элемент из начала очереди с poll(): " + polledElement);

        // 5. Получение элемента из начала очереди без удаления с помощью element()
        String firstElement = queue.element();

        System.out.println("Первый элемент в очереди (element()): " + firstElement);

        // 6. Получение элемента из начала очереди без удаления с помощью peek()
        String peekedElement = queue.peek();

        System.out.println("Первый элемент в очереди (peek()): " + peekedElement);
    }
}