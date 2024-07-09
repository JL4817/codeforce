import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day2 {

    public static void main(String args[]) {

        // Add extra paper (slack), which is the area of the smallest side of the box.
        // find the surface area of the box, which is 2*l*w + 2*w*h + 2*h*l.
        // slack is smallest area of two sides
        // 3x11x24 length width height

        int totalWrappingNeeded = 0;

        String filePath = "/Users/jinpillee/github-classroom/test/AdventOfCode/2015/D2.txt";
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filePath));

            String line;
            while ((line = reader.readLine()) != null) {

                // Split the line by "x" to get dimensions
                String[] dimensions = line.split("x");

                int length = Integer.parseInt(dimensions[0]);
                int width = Integer.parseInt(dimensions[1]);
                int height = Integer.parseInt(dimensions[2]);

                // finding the smallest side before x2
                int length1 = length * width;
                int length2 = width * height;
                int length3 = height * length;

                int smallest = Math.min(length1, Math.min(length2, length3));

                totalWrappingNeeded = totalWrappingNeeded + (2 * length1 + 2 * length2 + 2 * length3 + smallest);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(totalWrappingNeeded);

    }

}

// P1: 1588178
// P2: