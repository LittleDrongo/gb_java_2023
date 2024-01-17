package LinkedHashMap;

import java.util.LinkedHashMap;

//Если скорость не важна, то ЛинкедХэшМэп.
public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Создаем LinkedHashMap для хранения имен и их возрастов
        LinkedHashMap<String, Integer> ageMap = new LinkedHashMap<>();

        // Добавляем элементы в LinkedHashMap
        ageMap.put("Анна", 25);
        ageMap.put("Иван", 30);
        ageMap.put("Мария", 28);

        System.out.println("LinkedHashMap после добавления: " + ageMap);



        // Получаем возраст по имени
        int annaAge = ageMap.get("Анна");
        System.out.println("Возраст Анны: " + annaAge);


        // Удаляем элемент по имени
        ageMap.remove("Иван");
        System.out.println("LinkedHashMap после удаления: " + ageMap);


        // Проверяем наличие ключа
        boolean hasAnna = ageMap.containsKey("Анна");
        System.out.println("Есть ли ключ 'Анна'? " + hasAnna);


        // Получаем количество элементов
        int size = ageMap.size();
        System.out.println("Количество элементов в LinkedHashMap: " + size);



    }
}