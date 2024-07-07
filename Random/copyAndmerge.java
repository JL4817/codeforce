package Random;

public class copyAndmerge {

    public static void main(String[] args) {

        //
        int[] sourceArray = { 1, 2, 3, 4, 5 };
        int[] destinationArray = new int[5];

        // Copy elements from sourceArray to destinationArray
        System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);

        // Print the destinationArray
        for (int element : destinationArray) {
            System.out.print(element + " ");
        }

        int[] copy = sourceArray;

    }
}
