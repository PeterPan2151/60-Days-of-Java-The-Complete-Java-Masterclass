import java.util.Arrays;

public class LowestLargestValue2D{
    public static void main(String[] args) {
        int[][] my2DArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9, 10, 11, 12, 13, 0}
        };
        int largestValue = my2DArray[0][0];
        int lowestValue = my2DArray[0][0];

        for (int[] ints : my2DArray) {
            for (int anInt : ints) {
                if (anInt > largestValue) {
                    largestValue = anInt;
                }
                if (anInt < lowestValue) {
                    lowestValue = anInt;
                }
            }
        }
        System.out.println(largestValue);
        System.out.println(lowestValue);
    }
}
