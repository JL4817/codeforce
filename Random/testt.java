package Random;

import java.time.LocalDate;

public class testt {

    public static void main(String args[]) {
        String a = "ancasdadawdawdawd";
        String arr[] = a.split("");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        String b = "a n c a s d a d";
        String arrb[] = b.split(" ");

        for (int j = 0; j < arrb.length; j++) {
            System.out.println(arrb[j]);
        }

    }
}