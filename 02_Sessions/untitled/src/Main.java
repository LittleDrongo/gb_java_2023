public class Main {

    // method cntNtriangle
    private static int countNtriangle(int n) {
        int res = 0;
        // Если число n < 1 (ненатуральное) метод должен вернуть -1.

        if (n < 1)
            return -1;

        while (n != 0) {
            res = res + n;
            n = n - 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int tn = countNtriangle(4);
        System.out.println(tn);

    }
}