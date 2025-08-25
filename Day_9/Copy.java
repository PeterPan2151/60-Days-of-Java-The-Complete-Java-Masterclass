import java.util.Arrays;

public class Copy{

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7, 8};
        int[] backupOfNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(backupOfNums));

    }
}


