public class Main {
    
    // method cntNtriangle
    private static int countNtriangle(int num) {
        int res = 0;
        while (num != 0) {
            res = res + num;
            num = num - 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int tn = countNtriangle(5);
        System.out.println(tn);

    }
}