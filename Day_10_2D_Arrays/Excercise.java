import java.util.Arrays;
import java.util.Scanner;

public class Excercise {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Please enter the amount of rows and columns you want to have: ");
        int n = myScan.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.println("Please enter the value for " + i + " " + j + ": ");
                matrix[i][j] = myScan.nextInt();
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += matrix[i][i];
        }
        System.out.println("The primary diagonal sum is: " + sum);
        for (int i = 0; i < n; i++){
            if (i != n-1-i) {
                sum += matrix[i][n - 1 - i];
            }
        }


        myScan.close();
    }
}
