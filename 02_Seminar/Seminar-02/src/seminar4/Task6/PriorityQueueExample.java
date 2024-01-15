package seminar4.Task6;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Создаем приоритетную очередь с элементами типа Integer
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Добавляем элементы с учетом их приоритета
        priorityQueue.add(5);
        priorityQueue.add(3);
        priorityQueue.add(8);
        priorityQueue.add(1);

        // Извлекаем элементы с наивысшим приоритетом
        int highestPriority = priorityQueue.poll();
        int nextPriority = priorityQueue.poll();

        System.out.println("Наивысший приоритет: " + highestPriority);
        System.out.println("Следующий приоритет: " + nextPriority);


    }
}