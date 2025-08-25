import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7, 8};
        Arrays.sort(nums);
        int index = Arrays.binarySearch(nums, 7);
        System.out.println("Index of 7 is at: " + index);
    }
}
