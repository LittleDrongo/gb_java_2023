package TreeMap;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Создаем TreeMap для хранения имен и их возрастов
        TreeMap<String, Integer> ageMap = new TreeMap<>();

        // Добавляем элементы в TreeMap
        ageMap.put("Анна", 25);
        ageMap.put("Иван", 30);
        ageMap.put("Мария", 28);

        // Получаем элементы в упорядоченном порядке по ключам
        System.out.println("Возраст Анны: " + ageMap.get("Анна"));
        System.out.println("Первый элемент: " + ageMap.firstEntry());
        System.out.println("Последний элемент: " + ageMap.lastEntry());

        // Удаляем элемент по имени
        ageMap.remove("Иван");
        System.out.println("TreeMap после удаления: " + ageMap);

        // Проверяем наличие ключа
        boolean hasAnna = ageMap.containsKey("Анна");
        System.out.println("Есть ли ключ 'Анна'? " + hasAnna);

        // Получаем количество элементов
        int size = ageMap.size();
        System.out.println("Количество элементов в TreeMap: " + size);

    }
}