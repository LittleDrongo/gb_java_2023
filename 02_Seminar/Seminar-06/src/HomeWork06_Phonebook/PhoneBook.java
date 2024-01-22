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
        HashMap<String, List<String>> phoneBook = new HashMap<>();

        addContact(phoneBook, "Алексей", "7646514561");
        addContact(phoneBook, "Алексей", "46151674");
        addContact(phoneBook, "Сергей", "46151004");

        System.out.println(phoneBook);

    }

    private static void addContact(Map<String, List<String>> phoneBook, String name, String phone){
        phoneBook.computeIfAbsent(name, k -> new ArrayList<>()).add(phone);
    }

}
