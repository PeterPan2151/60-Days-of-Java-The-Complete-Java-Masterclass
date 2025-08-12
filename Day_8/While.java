import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter a number lower than 10: ");
        int n = myScan.nextInt();
        while (n <= 10) {
            System.out.println(n);
            n++;
        }
    }
}
