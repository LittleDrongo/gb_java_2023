package homework21;

class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS) {
        // Напишите свое решение ниже

        // Удаление ненужных символов
        String paramsFormated = "";
        paramsFormated = PARAMS.replaceAll("[{}\"]", "");
        paramsFormated = paramsFormated.replaceAll(":", "='");
        paramsFormated = paramsFormated.replaceAll(",", "',");
        paramsFormated = paramsFormated.replaceAll(",", " and");

        StringBuilder paramsBuilder = new StringBuilder(paramsFormated);
        paramsBuilder.append("'");


        String[] array = (paramsBuilder.toString().split(" and "));
        StringBuilder paramsNoNull = new StringBuilder();

        //Проверка на наличие в параметре null
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains("null")) {
                continue;
            } else {
                if (i < array.length - 2) {
                    paramsNoNull.append(array[i]);
                    paramsNoNull.append(" and ");
                } else {
                    paramsNoNull.append(array[i]);
                }
            }


        }
        StringBuilder result = new StringBuilder(QUERY + paramsNoNull);
        return result;
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        String QUERY = "";
        String PARAMS = "";

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            QUERY = "select * from students where ";
//            PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
            PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
//            '{"name":"Andron", "country":"Russia", "city":"Moscow", "age":"null"}'
//            '{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}'
        }
        else{
            QUERY = args[0];
            PARAMS = args[1];
        }

        Answer ans = new Answer();
        System.out.println(ans.answer(QUERY, PARAMS));
    }
}