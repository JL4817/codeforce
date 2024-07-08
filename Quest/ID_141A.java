import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ID_141A {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        // String s1 = input.nextLine();
        String s1 = "SANTACLAUS";
        // String s2 = input.nextLine();
        String s2 = "DEDMOROZ";
        String added = s1 + s2;
        String s3 = input.nextLine();
        char addChar[] = s3.toCharArray();
        HashSet<Character> namesHash = new HashSet<Character>(added.length());
        int count = 0;

        java.util.Iterator<Character> it = namesHash.iterator();

        // HashMap<String, Integer> map = new HashMap<>(100);

        // need to add thing first to hashset before trying to iterate it
        while (it.hasNext()) {
            namesHash.add(addChar[count]);
            count++;
            // System.out.println(it.next());
        }

        char match[] = input.nextLine().toCharArray(); // can this match

        for (int i = 0; i < match.length; i++) {
            if (namesHash.contains(match[i])) {
                namesHash.remove(match[i]);
            }
        }

        if (namesHash.isEmpty() == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        input.close();

    }
}
