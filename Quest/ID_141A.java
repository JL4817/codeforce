import java.util.HashSet;
import java.util.Scanner;

public class ID_141A {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String s2 = input.nextLine();

        char containsFinal[] = input.nextLine().toCharArray();

        HashSet<Character> name = new HashSet<Character>();

        for (char c : containsFinal) {
            name.add(c);
        }

        String arr[] = (s1 + s2).split("");

        for (int i = 0; i < arr.length; i++) {
            if (name.contains(arr[i])) {
                name.remove(arr[i]);
            }
        }

        if (name.isEmpty()) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

    }
}
