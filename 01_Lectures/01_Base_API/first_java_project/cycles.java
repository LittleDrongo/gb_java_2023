public class cycles {
    public static void main(String[] args) {

        int value = 321;
        int count = 0;

        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                continue;
                // break;
            }
            System.out.println(i);
        }

    }
}
