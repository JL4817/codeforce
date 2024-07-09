import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class Day3 {
    public static void main(String[] args) {

        // int count = 1;
        int santaX = 0;
        int robotX = 0;
        int santaY = 0;
        int robotY = 0;

        ArrayList<String> list = new ArrayList<>();
        list.add("0.0");

        String filePath = "/Users/jinpillee/github-classroom/test/AdventOfCode/2015/D3.txt";
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = reader.readLine()) != null) {
                String pos[] = line.split("");

                for (int i = 0; i < pos.length; i++) {

                    if (i % 2 == 0) { // even, robot move

                        if (pos[i].equals("^")) {
                            robotY++;
                            list.add(robotX + "." + robotY);

                        } else if (pos[i].equals("v")) {
                            robotY--;
                            list.add(robotX + "." + robotY);

                        } else if (pos[i].equals(">")) {
                            robotX++;
                            list.add(robotX + "." + robotY);

                        } else if (pos[i].equals("<")) {
                            robotX--;
                            list.add(robotX + "." + robotY);

                        }

                    } else { // santa

                        if (pos[i].equals("^")) {
                            santaY++;
                            list.add(santaX + "." + santaY);

                        } else if (pos[i].equals("v")) {
                            santaY--;
                            list.add(santaX + "." + santaY);

                        } else if (pos[i].equals(">")) {
                            santaX++;
                            list.add(santaX + "." + santaY);

                        } else if (pos[i].equals("<")) {
                            santaX--;
                            list.add(santaX + "." + santaY);

                        }

                    }

                }

            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Use a HashSet to find unique elements
        HashSet<String> uniqueElements = new HashSet<>(list);

        // Count the number of unique elements
        int numberOfUniqueElements = uniqueElements.size();

        System.out.println(numberOfUniqueElements);

    }

}

// Part1: 2565
// Part2: 2639
