public class Program {
    public static void main(String[] args) {

        Worker w1 = new Worker();
        w1.firstName = "Имя_1";
        w1.lastName = "Фамилия_1";
        w1.salary = 100;
        w1.id = 1000;

        Worker w4 = new Worker();
        w4.firstName = "Имя_1";
        w4.lastName = "Фамилия_1";
        w4.salary = 100;
        w4.id = 1000;

        System.out.println(w1.equals(w4));
        System.out.println(w1.toString());
        System.out.println("w1 == w4");

    }
}