public class types {
    public static void main(String[] args) {

        // Примитивные типы данных
        // int num_type = 1;
        // boolean toogle_type = true;
        // short short_type = 1234;
        // double double_type = 1234;
        float float_type = 10f; // ????

        // String s = " 321321312";
        // String s = null;

        // System.out.println(s);

        // short age = 10;
        // char ch = '{';

        // System.out.println(ch);

        // boolean f = true;

        // System.out.println(f);
        // char char_type = Привет!;      
        
        
        // var i = 123;
        // System.out.println(i);        
        // System.out.println(getType(i));

        // Почему нельзя сразу использовать конструкцию в теле main метода?
        // o.getClass().getSimpleName();
        // System.out.println(Integer.MAX_VALUE);

        // String s = "qwer";
        // s.charAt(0);

        // int a = 123;
        // // a++;
        // System.out.println(++a); //Операция инкримента выше чем вывод (префиксный инкремент)

        // System.out.println(a++); //Операция инкримента ниже чем вывод (постфиксный инкремент)
        // System.out.println(a);
/*
        int a = 123;
        a = a-- - --a;
        System.out.println(a);

        int b = 123;
        b = b++ + ++b;
        System.out.println(b);

        int c = 123;
        c = --c - c--;
        System.out.println(c);

        boolean f = 123 != 120;
        System.out.println(f);

        
 */     //Побитовые операции

 /*
        int a = 18;
        //input: 10010
        // a = a << 1;

        System.out.println(a >> 1);
        
        //out: 1001
    }
 */
/*
    //Побитовое сравенние
        int a = 5;
        int b = 2;

        System.out.println(a ^ b);
*/

    // int[] arr = new int[10];
    int[] arr = new int[] {1, 2, 3, 4};
    arr[3] = 13;
    System.out.println(arr[3]);

    int [] arr3d [] = new int[3] [5];

    for (int i = 0; i <arr.length; i ++){
        for (int j = 0; j < arr3d.length; j++) {
            System.out.println(arr3d[i][j]);
        }
    }


    }

    // Получить тип данных
    static String getType(Object o){ 
        return o.getClass().getSimpleName();
    }
}
