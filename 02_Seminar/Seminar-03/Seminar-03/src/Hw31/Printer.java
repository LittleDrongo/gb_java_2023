import java.util.Arrays;

class MergeSort {
    public static int[] mergeSort(int[] a) {
        // Напишите свое решение ниже

        mergeSortingRecursive(a);
        return a;

    }

    public static void mergeSortingRecursive(int[] arr) {

        if (arr.length <= 1) {
            return; // Возвращаемся из метода, не выполняя дополнительных действий
        }

        // Находим средний индекс массива
        int middle = ((arr.length / 2));

        // Делим массив на две половины: левую и правую

        int[] left = Arrays.copyOfRange(arr, 0, middle);
        int[] right = Arrays.copyOfRange(arr, middle, arr.length);

        // Рекурсивно сортируем левую и правую половины списка
        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);

    }

    public static void merge(int[] result, int[] left, int[] right) {

        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
            k++;
        }

        // Если остались элементы только в левой или правой половине, добавляем их в
        // исходный список
        while (i < left.length) {
            result[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            result[k] = right[j];
            j++;
            k++;
        }

    }

}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        int[] a;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[] { 5, 1, 6, 2, 3, 4 };
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}