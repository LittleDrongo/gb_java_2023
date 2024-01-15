import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class Answer {
    public static void analyzeNumbers(Integer[] arr) {

        // Сортируем список по возрастанию и выводим на экран

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        ArrayList<Integer> sortedArrayList = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }

        double count = 0;
        int min = 0;
        int max = 0;
        double avg;
        double sum = 0;

        for (int j = 0; j < arr.length; j++) {
            if (j == 0) {
                min = pq.peek();
            }

            if (j == arr.length - 1) {
                max = pq.peek();
            }

            sum += pq.peek();
            sortedArrayList.add(pq.poll());
            count++;
        }

        avg = sum / count;

        System.out.println(sortedArrayList);

        // Находим и выводим минимальное значение
        System.out.println("Minimum is " + min);

        // Находим и выводим максимальное значение
        System.out.println("Maximum is " + max);

        // Находим и выводим среднее арифметическое
        System.out.println("Average is = " + avg);
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer3 {
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[] { -2, -1, 0, 1, 2, 3, 4, 5 };
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer ans = new Answer();
        ans.analyzeNumbers(arr);
    }
}