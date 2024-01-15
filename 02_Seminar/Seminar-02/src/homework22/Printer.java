// // package homework22;

// import java.io.*;
// import java.util.Arrays;
// import java.text.SimpleDateFormat;
// import java.util.Date;

// class BubbleSort {
//     private static File log;
//     private static FileWriter fileWriter;

//     public static String buildArrayLine(int[] mas) {

//         // Вывод массива в терминал
//         StringBuilder masBuilder = new StringBuilder();

//         // Формирую правую часть строки для лога файла
//         masBuilder.append("[");
//         for (int i = 0; i < mas.length; i++) {
//             if (i == mas.length - 1) {
//                 masBuilder.append(mas[i]);
//             } else {
//                 masBuilder.append(mas[i] + ", ");
//             }
//         }
//         masBuilder.append("]");
//         return masBuilder.toString();

//     }

//     public static void sort(int[] mas) {
//         try {

//             // Очистка файла log перед началом сортировки
//             log = new File("log.txt");
//             if (log.exists()) {
//                 log.delete();
//             }

//             fileWriter = new FileWriter(log, true); // true для дозаписи в файл

//             // Логирование времени
//             String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date());

//             for (int i = 0; i < mas.length - 1; i++) {
//                 for (int j = 0; j < mas.length - 1 - i; j++) {
//                     if (mas[j] > mas[j + 1]) {
//                         int temp = mas[j];
//                         mas[j] = mas[j + 1];
//                         mas[j + 1] = temp;
//                     }
//                 }
//                 fileWriter.write((timestamp + " " + buildArrayLine(mas) + "\n"));
//             }
            

//             fileWriter.close();// Закрытие FileWriter после записи в файл

//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }

// // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
// public class Printer {
//     public static void main(String[] args) {
//         int[] arr = {};

//         if (args.length == 0) {
//             // При отправке кода на Выполнение, вы можете варьировать эти параметры
//             arr = new int[] { 9, 3, 4, 8, 2, 5, 7, 1, 6, 10 };
//         } else {
//             arr = Arrays.stream(args[0].split(", "))
//                     .mapToInt(Integer::parseInt)
//                     .toArray();
//         }

//         BubbleSort ans = new BubbleSort();
//         ans.sort(arr);

//         try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
//             String line;
//             while ((line = br.readLine()) != null) {
//                 System.out.println(line);
//             }
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }

import java.io.*;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;

class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;

    public static String buildArrayLine(int[] mas) {
        // Вывод массива в терминал
        StringBuilder masBuilder = new StringBuilder();

        // Формирую правую часть строки для лога файла
        masBuilder.append("[");
        for (int i = 0; i < mas.length; i++) {
            if (i == mas.length - 1) {
                masBuilder.append(mas[i]);
            } else {
                masBuilder.append(mas[i] + ", ");
            }
        }
        masBuilder.append("]");
        return masBuilder.toString();
    }

    public static void sort(int[] mas) {
        try {
            // Очистка файла log перед началом сортировки
            log = new File("log.txt");
            if (log.exists()) {
                log.delete();
            }

            fileWriter = new FileWriter(log, true); // true для дозаписи в файл

            // Логирование времени
            String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date());
            boolean swapped; // флаг для проверки перестановок

            for (int i = 0; i < mas.length - 1; i++) {
                swapped = false;
                for (int j = 0; j < mas.length - 1 - i; j++) {
                    if (mas[j] > mas[j + 1]) {
                        int temp = mas[j];
                        mas[j] = mas[j + 1];
                        mas[j + 1] = temp;
                        swapped = true;
                    }
                }
                if (swapped) {
                    fileWriter.write((timestamp + " " + buildArrayLine(mas) + "\n"));
                }
            }
            fileWriter.write((timestamp + " " + buildArrayLine(mas) + "\n"));

            fileWriter.close(); // Закрытие FileWriter после записи в файл

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        int[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new int[] { 9, 4, 8, 3, 1 };
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        BubbleSort ans = new BubbleSort();
        ans.sort(arr);

        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}