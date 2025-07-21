import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // System.out.println("Enter you name: ");
        // // get input as a String with nextLine()
        // String name = scan.nextLine();

        System.out.println("Enter number a: ");
        int a = scan.nextInt();
        System.out.println("Enter number b: ");
        int b = scan.nextInt();

        // System.out.println("Hello " + name);
        System.out.println("The sum of a and b is " + (a + b));
        scan.close();
    }
}