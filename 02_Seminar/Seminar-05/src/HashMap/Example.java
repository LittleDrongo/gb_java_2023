package HashMap;

import java.util.HashMap;

public class Example {
    public static void main(String[] args) {
        // Создание объекта HashMap
        HashMap<String, Integer> studentGrades = new HashMap<>();

        // Добавление данных
        studentGrades.put("Анна", 85);
        studentGrades.put("Иван", 92);
        studentGrades.put("Мария", 78);

        // Получение данных по ключу
        int grade = studentGrades.get("Иван");
        System.out.println("Оценка Ивана: " + grade);





        // Удаляем элемент по имени
        studentGrades.remove("Иван");
        System.out.println("HashMap после удаления: " + studentGrades);


        // Проверяем наличие ключа
        boolean hasAnna = studentGrades.containsKey("Анна");
        System.out.println("Есть ли ключ 'Анна'? " + hasAnna);
    }
}

// Колизии - разные ключи, имеют одинаковый ХК.
//