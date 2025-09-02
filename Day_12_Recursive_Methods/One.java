import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter a number to know their factorial: ");
        int number = myScan.nextInt();

        int result = factorial(number);

        System.out.println("The factorial of " + number + " is " + result);

        myScan.close();
    }


    public static int factorial(int n) {
        if (n == 0){
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
}
