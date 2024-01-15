package seminar4.Task7;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Добавление элементов в стек
        stack.push("Элемент 1");
        stack.push("Элемент 2");
        stack.push("Элемент 3");

        // Извлечение и удаление элементов с вершины стека
        String topElement = stack.pop();
        System.out.println("Извлеченный элемент: " + topElement);

        // Получение элемента с вершины стека без удаления
        String peekedElement = stack.peek();
        System.out.println("Элемент на вершине стека: " + peekedElement);

        // Проверка, пуст ли стек
        boolean isEmpty = stack.empty();
        System.out.println("Стек пустой? " + isEmpty);
    }
}