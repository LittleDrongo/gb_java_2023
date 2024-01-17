package HashMap;

import java.util.HashMap;
import java.util.Set;


public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Анна", 25);
        ageMap.put("Иван", 30);
        ageMap.put("Мария", 28);

        // Проверяем наличие значения
        boolean hasAge30 = ageMap.containsValue(30);
        System.out.println("Есть ли значение '30'? " + hasAge30);


        // Получаем количество элементов
        int size = ageMap.size();
        System.out.println("Количество элементов в HashMap: " + size);

        // Проверяем, пуст ли HashMap
        boolean isEmpty = ageMap.isEmpty();
        System.out.println("HashMap пустой? " + isEmpty);

        // Получаем набор ключей
        Set<String> keys = ageMap.keySet();
        System.out.println("Набор ключей: " + keys);
    }
}