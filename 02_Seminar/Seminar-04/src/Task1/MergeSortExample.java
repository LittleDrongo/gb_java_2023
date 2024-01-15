package Task1;

import java.util.ArrayList;
import java.util.List;

public class MergeSortExample { // Объявление класса MergeSortExample
    public static void main(String[] args) { // Основной метод программы
        // Создаем неотсортированный список чисел
        List<Integer> unsortedList = new ArrayList<>(); // Создаем объект ArrayList для хранения целых чисел
        unsortedList.add(5); // Добавляем число 5 в список
        unsortedList.add(1); // Добавляем число 1 в список
        unsortedList.add(9); // Добавляем число 9 в список
        unsortedList.add(3); // Добавляем число 3 в список
        unsortedList.add(7); // Добавляем число 7 в список

        // Выводим неотсортированный список
        System.out.println("Неотсортированный список: " + unsortedList);

        // Вызываем метод сортировки слиянием
        mergeSort(unsortedList);

        // Выводим отсортированный список
        System.out.println("Отсортированный список: " + unsortedList);
    }

    // Метод сортировки слиянием
    public static void mergeSort(List<Integer> list) {
        // Проверяем базовый случай: если список содержит 1 элемент или меньше, он уже отсортирован
        if (list.size() <= 1) {
            return; // Возвращаемся из метода, не выполняя дополнительных действий
        }

        // Находим средний индекс списка
        int middle = list.size() / 2;

        // Делим список на две половины: левую и правую
        List<Integer> left = new ArrayList<>(list.subList(0, middle)); // Создаем левую половину списка
        List<Integer> right = new ArrayList<>(list.subList(middle, list.size())); // Создаем правую половину списка

        // Рекурсивно сортируем левую и правую половины списка
        mergeSort(left); // Вызываем метод сортировки слиянием для левой половины
        mergeSort(right); // Вызываем метод сортировки слиянием для правой половины

        // Объединяем отсортированные половины в исходный список
        merge(list, left, right); // Вызываем метод объединения
    }

    // Метод для объединения двух отсортированных списков в один
    public static void merge(List<Integer> result, List<Integer> left, List<Integer> right) {
        int i = 0, j = 0, k = 0;

        // Пока есть элементы в обеих половинах
        while (i < left.size() && j < right.size()) {
            // Сравниваем элементы левой и правой половин
            if (left.get(i) < right.get(j)) {
                result.set(k, left.get(i)); // Заменяем элемент в исходном списке на элемент из левой половины
                i++;
            } else {
                result.set(k, right.get(j)); // Заменяем элемент в исходном списке на элемент из правой половины
                j++;
            }
            k++;
        }

        // Если остались элементы только в левой или правой половине, добавляем их в исходный список
        while (i < left.size()) {
            result.set(k, left.get(i));
            i++;
            k++;
        }

        while (j < right.size()) {
            result.set(k, right.get(j));
            j++;
            k++;
        }
    }
}

// 5, 1,                9, 3, 7

// 1, 5,                3, 7, 9

//1, 3, 5, 7, 9