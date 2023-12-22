public class HomeWork13 {
    public static void main(String[] args) {

        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        switch (op){
            case '+':
            case '-':
            case '*':
            case '/':
                Calculator calculator = new Calculator();
                int result = calculator.calculate(op, a, b);
                float endResult = (float) result;
                System.out.println(endResult);
                break;
            default:
                System.out.println("Некорректный оператор: 'оператор'");
                break;
        }


    }
}

class Calculator {
    public int calculate(char op, int a, int b) {
        int result = 0;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                result = 0;
        }
        return result;
    }
}