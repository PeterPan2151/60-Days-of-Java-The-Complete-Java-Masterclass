import java.util.Arrays;

public class Sum2D{
    public static void main(String[] args) {
        int[][] my2DArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9, 10, 11, 12, 13, 0}
        };
        int total = 0;

        for (int[] ints : my2DArray) {
            for (int anInt : ints) {
                total += anInt;
            }
        }
        System.out.println(total);
    }
}
