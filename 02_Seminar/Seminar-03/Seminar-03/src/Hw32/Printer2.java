// import java.util.Arrays;
// import java.util.ArrayList;

// class Answer {
//     public List<Integer> removeEvenNumbers(Integer[] arr) {
//         // Введите свое решение ниже
//         List<Integer> oddNumsList = new ArrayList<>(); // Создаю ArrayList для нечётных чисел.

//         for (int i = 0; i < arr.length; i++) {
//             oddNumsList.add(arr[i]);
//         }

//         return oddNumsList;

//     }
// }

// // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
// public class Printer2 {
//     public static void main(String[] args) {
//         Integer[] arr = {};

//         if (args.length == 0) {
//             // При отправке кода на Выполнение, вы можете варьировать эти параметры
//             arr = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//         } else {
//             arr = Arrays.stream(args[0].split(", "))
//                     .map(Integer::parseInt)
//                     .toArray(Integer[]::new);
//         }

//         Answer ans = new Answer();
//         ans.removeEvenNumbers(arr);
//     }
// }

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Answer {
    public void removeEvenNumbers(Integer[] arr) {
        
        // Создаю ArrayList для нечётных чисел.
        ArrayList<Integer> oddNumsList = new ArrayList<>();

        // Перебираю в цикле все нечётные и заполняю arrayList
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddNumsList.add(arr[i]);
            }
        }

        // печатаю нечётный список
        System.out.println(oddNumsList);
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer2 {
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer ans = new Answer();
        ans.removeEvenNumbers(arr);
    }
}
