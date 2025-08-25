public class SumMinMax {
    public static void main(String[] args) {
        int[] numbers = {1, 12, 33, 45, 5, -7};
        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];

        for (int number : numbers) {
            sum += number;
            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }
        }
        System.out.println("Sum is: " + sum);
        System.out.println("The max number is: " + max);
        System.out.println("The min number is: " + min);
    }
}
