import java.util.Scanner;

public class ID_122A {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number % 4 == 0 || number % 7 == 0) {
            int newN = number;
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}