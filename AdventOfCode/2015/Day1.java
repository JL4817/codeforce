import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day1 {
    public static void main(String[] args) {

        int count = 0;
        int total = 0;

        String filePath = "/Users/jinpillee/github-classroom/test/AdventOfCode/2015/D1.txt";
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line[] = reader.readLine().split("");

            for (int i = 0; i < line.length; i++) {

                if (line[i].equals("(")) {
                    total++;
                    count++;
                } else if (line[i].equals(")")) {
                    total++;
                    count--;
                }

                if (count == -1) {
                    System.out.println(total);
                    break;
                }
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(count);
    }
}

// part 1: 280
// part 2: 1797