public class main {
    public static void main45(String[] args) {

        Object o = 1; GetType(o);       //java.lang.Integer
        o = 1.2; GetType(o);            //java.lang.Double

    }

    static void GetType(Object obj) {
        System.out.println(obj.getClass().getName());
    }
}