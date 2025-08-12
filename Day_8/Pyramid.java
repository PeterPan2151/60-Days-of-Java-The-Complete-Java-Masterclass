import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.println("Enter the amount of levels for the pyramid: ");
        int levels = myScan.nextInt();

        for (int i = 1; i <= levels; i++) {
            for (int j = 0; j < levels - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        myScan.close();
    }
}
