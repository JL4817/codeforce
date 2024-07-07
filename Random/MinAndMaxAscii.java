package Random;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MinAndMaxAscii {

    public static void main(String args[]) {

        int arr[] = { 3, 3, 2, 1, 4, 5, 6, 3 };

        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            hash.put(i, arr[i]);
        }

        System.out.print(hash);

    }

}
