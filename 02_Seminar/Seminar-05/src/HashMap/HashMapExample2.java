package HashMap;

import java.util.HashMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class HashMapExample2 {
    public static void main(String[] args) {
        HashMap<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Анна", 25);
        ageMap.put("Иван", 30);
        ageMap.put("Мария", 28);

        // Получаем коллекцию значений
        Collection<Integer> values = ageMap.values();
        System.out.println("Коллекция значений: " + values);



        // Получаем набор записей (ключ-значение)
        Set<Map.Entry<String, Integer>> entries = ageMap.entrySet();
        System.out.println("Набор записей: " + entries);

        // Очищаем HashMap
        ageMap.clear();
        System.out.println("HashMap после очистки: " + ageMap);

        ////////////////////////////////////////////////////////////////
        // Создаем другую HashMap
        HashMap<String, Integer> newAgeMap = new HashMap<>();
        newAgeMap.put("Иван", 30);
        newAgeMap.put("Мария", 28);

        // Добавляем все элементы из newAgeMap в ageMap
        ageMap.putAll(newAgeMap);
        System.out.println("HashMap после добавления элементов из другой карты: " + ageMap);
    }
}