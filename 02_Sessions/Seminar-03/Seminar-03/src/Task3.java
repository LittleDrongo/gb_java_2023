import java.io.File;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) {
        try {
            // Создаем объект файла
            File file = new File("example.txt");

            // Проверяем, существует ли файл
            if (!file.exists()) {
                // Создаем новый файл, если он не существует
                file.createNewFile();
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Получаем и выводим путь к файлу
            System.out.println("File path: " + file.getAbsolutePath());

            // Удаляем файл
            file.delete();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}