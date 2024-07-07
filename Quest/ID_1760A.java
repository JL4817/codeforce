import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ID_1760A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nrCase = input.nextInt();

        input.nextLine();

        for (int i = 0; i < nrCase; i++) {

            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            int[] arr = { a, b, c };
            Arrays.sort(arr);

            System.out.println(arr[1]);

        }
    }
}
