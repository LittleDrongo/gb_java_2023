package HomeWork06_Phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Java: знакомство и как пользоваться базовым API (семинары)
// Урок 6. Хранение и обработка данных ч3: множество коллекций Set
//        Формат сдачи: ссылка на подписанный git-проект.
//
// Задание
//
// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что в во входной структуре будут повторяющиеся имена с разными телефонами,
// их необходимо считать, как одного человека с разными телефонами.

// Вывод должен быть отсортирован по убыванию числа телефонов.
// Загрузите задание на проверку до 26 янв., 21:01 +03:00 UTC

public class PhoneBook {
    public static void main(String[] args) {

        // Создаю HashMap телефонной книги
        HashMap<String, List<Integer>> phoneBook = new HashMap<>();


        phoneBook.computeIfAbsent("Алексей", k -> new ArrayList<>()).add(896714030);
        phoneBook.computeIfAbsent("Сергей", k -> new ArrayList<>()).add(00000);
        phoneBook.computeIfAbsent("Алексей", k -> new ArrayList<>()).add(534534534);
        phoneBook.computeIfAbsent("Пётр", k -> new ArrayList<>()).add(666);
//
        System.out.println(phoneBook);
//        if (phoneBook.containsKey("Алексей"))
//        {
//            System.out.println("ddd");
//        }

    }
}
