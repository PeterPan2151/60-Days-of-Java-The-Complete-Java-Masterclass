import java.util.Scanner;

public class ReturnMethods {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.println("Enter first number:");
        int n1 = myScan.nextInt();

        System.out.println("Enter second number:");
        int n2 = myScan.nextInt();

        System.out.println("Result of addition: " + add(n1, n2));
        System.out.println("Result of subtraction: " + subtract(n1, n2));

        myScan.close();
    }

    public static int add(int num1, int num2){
         return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }
}
