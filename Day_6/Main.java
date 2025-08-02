import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String name = myScan.nextLine();
        int b = 3;

        if (name.equals("Peter")){
            System.out.println("Hello Peter");
            System.out.println("Enter a number: ");
            int num1 = myScan.nextInt();
            if (num1 > b) {
                System.out.println("Number a is greater than b");
            }
        }

        myScan.close();
    }
}
