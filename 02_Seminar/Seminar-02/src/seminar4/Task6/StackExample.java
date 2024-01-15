package seminar4.Task6;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Создаем стек с элементами типа String
        Stack<String> stack = new Stack<>();

        // Добавляем элементы в стек
        stack.push("Элемент 1");
        stack.push("Элемент 2");
        stack.push("Элемент 3");

        // Извлекаем элементы с вершины стека
        String topElement = stack.pop();
        String nextTopElement = stack.pop();

        System.out.println("Вершина стека: " + topElement);
        System.out.println("Следующая вершина стека: " + nextTopElement);
    }
}