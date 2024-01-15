public class Task2 {
    public static void main(String[] args) {
        // Создаем объект StringBuilder с начальным содержимым
//        StringBuilder builder = new StringBuilder("Hello");
//
//        // Добавляем дополнительный текст
//        builder.append(", World");
//        builder.append("!");
//
//
//        // Выводим текущее состояние StringBuilder
//        System.out.println("Current StringBuilder content: " + builder.toString());
//
//        // Добавляем текст в начало
//        builder.insert(0, "Greetings: ");
//
//        // Выводим измененное состояние
//        System.out.println("Modified StringBuilder content: " + builder.toString());

        StringBuilder builder = new StringBuilder("Hello, Java World!");
        System.out.println(builder);
        // Удаляем часть строки
        builder.delete(6, 11); // Удаляем слово "Java"
        System.out.println("After deletion: " + builder.toString());

        // Заменяем часть строки
        builder.replace(7, 12, "Universe");
        System.out.println("After replacement: " + builder.toString());
        System.out.println("последнее");

        System.out.println(System.identityHashCode(builder));
//
//        // Постепенно добавляем текст
//        builder.append("Java ");
//        builder.append("is ");
//        builder.append("awesome.");
//
//        // Преобразуем StringBuilder обратно в строку
//        String finalString = builder.toString();
//
//        // Выводим итоговую строку
//        System.out.println("Final string: " + finalString);
//
//
//
//
//        StringBuilder builder = new StringBuilder();
//
//        // Постепенно добавляем текст
//        builder.append("Java ");
//        builder.append("is ");
//        builder.append("awesome.");
//
//        // Преобразуем StringBuilder обратно в строку
//        String finalString = builder.toString();
//
//        // Выводим итоговую строку
//        System.out.println("Final string: " + finalString);



    }
}

