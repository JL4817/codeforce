import java.util.Scanner;

public class ID_510A {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // int row = input.nextInt();
        // int col = input.nextInt();

        int row = 9;
        int col = 9;

        String[][] matrix = new String[row][col];
        String hash = "#";
        String dot = ".";
        int count = 2; // if even the right/down, if odd left/down
        boolean t = false;

        int mark = 0;

        for (int i = 0; i < matrix.length; i++) { // Loop through rows
            for (int j = 0; j < matrix[i].length; j++) { // Loop through columns

                if (count % 2 == 0) {
                    System.out.print(hash);

                } else if (count % 2 != 0 && mark == 0) {

                    if (j < col) {

                        if (j < mark - 1) {

                            System.out.print(dot);
                        } else {
                            System.out.print(hash);
                            mark = 1;

                        }

                    }

                } else if (j < col && mark == 1) {

                    if (j == 0) {

                        System.out.print(hash);

                    } else {

                        System.out.print(dot);

                    }

                    if (j == mark - 1) {
                        mark = 0;
                    }

                }

            }

            System.out.println(); // Move to the next line after each row
            count++;
        }

    }
}
