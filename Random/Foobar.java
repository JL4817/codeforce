package Random;

import java.util.HashMap;

public class Foobar {

    public static int solution(int[] x, int[] y) {

        for (int i = 0; i < x.length; i++) {
            boolean found = false;
            for (int k = 0; k < y.length; k++) {
                if (x[i] == y[k]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return x[i];
            }
        }

        return 0;

    }

    public static void main(String[] args) {
        int[] x = { 13, 5, 6, 2, 5 };
        int[] y = { 5, 2, 5, 13 };
        System.out.println(solution(x, y)); // Output: 6

    }

}
