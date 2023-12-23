package homework21;

class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS){
        // Напишите свое решение ниже

        // Удаление ненужных символов
        String paramsFormated = "";
//        PARAMS = PARAMS.replaceAll("[{}\"]", "");
        paramsFormated = PARAMS.replaceAll("[{}\"]", "");
//        PARAMS = PARAMS.replaceAll("[:\"]", "'=");
        paramsFormated = paramsFormated.replaceAll(":", "='");
        paramsFormated = paramsFormated.replaceAll(",", "',");
        paramsFormated = paramsFormated.replaceAll(",", " and");

        StringBuilder paramsBuilder = new StringBuilder(paramsFormated);
        paramsBuilder.delete(paramsBuilder.length()-1, paramsBuilder.length());
        paramsBuilder.append("'");
        System.out.println(paramsBuilder);

        String tempResult = (QUERY + paramsBuilder.toString());
        String result = tempResult.replaceAll("'null'", "null");

        System.out.println(result);
        return null;
    }

    private static void charsReplacer(StringBuilder sqlB, char ch1, char ch2) {
        for (int index = 0; index < sqlB.length(); index++) {
            if (sqlB.charAt(index) == ch1) {
                sqlB.setCharAt(index, ch2);
            }
        }
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
            PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        }
        else{
            QUERY = args[0];
            PARAMS = args[1];
        }

        Answer ans = new Answer();
        System.out.println(ans.answer(QUERY, PARAMS));
    }
}