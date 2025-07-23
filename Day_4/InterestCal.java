import java.util.Scanner;

public class InterestCal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double principal, interest, time, simpleInterest;

        System.out.println("Enter your principal amount: ");
        principal = scan.nextDouble();

        System.out.println("Enter the interest rate(in percentage): ");
        interest = scan.nextDouble();

        System.out.println("Enter the time period(in years): ");
        time = scan.nextDouble();

        simpleInterest = (principal * interest * time) / 100;

        System.out.println("Simple Interest: $" + simpleInterest);
        scan.close();
    }
}
