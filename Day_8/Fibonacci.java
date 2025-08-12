import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Please enter the number of terms");
        int n = myScan.nextInt();

        int firstTerm = 0, secondTerm = 1;

        if (n == 1){
            System.out.println(firstTerm);
        } else {
            System.out.print(firstTerm + " " + secondTerm);
            for (int i = 3; i <= n; i++) {
                int nextTerm = firstTerm + secondTerm;
                System.out.print(" " + nextTerm);
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }



        myScan.close();
    }
}
