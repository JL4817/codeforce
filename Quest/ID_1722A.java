import java.util.Scanner;

public class ID_1722A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int caseNr = input.nextInt();
        input.nextLine();
        int count = 0;

        for (int i = 0; i < caseNr; i++) {
            // Timur
            int letter = input.nextInt();
            input.nextLine();
            String uncertain[] = input.nextLine().split("");

            for (int j = 0; j < letter; j++) {
                if (uncertain[j].equals("T") || uncertain[j].equals("r") || uncertain[j].equals("i")
                        || uncertain[j].equals("m") || uncertain[j].equals("u")) {
                    count++;
                }
            }

            if (count == 5) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
