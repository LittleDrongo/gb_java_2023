package Task5;

import java.io.FileOutputStream;
import java.io.IOException;

public class Task5 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("example.txt");

            // Строка для записи
            String str = "Hello, Java!";
//            System.out.println(str.getBytes());
            // Преобразуем строку в массив байтов и записываем в файл
            fos.write(str.getBytes());
            fos.close();

            System.out.println("File written successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}