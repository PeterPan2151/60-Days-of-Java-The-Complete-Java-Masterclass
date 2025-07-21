import java.util.Scanner;

public class CalorieCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String food1, food2, food3;
        double cal1, cal2, cal3, totalCal;

        System.out.println("Enter 3 foods: ");
        food1 = scan.next();
        food2 = scan.next();
        food3 = scan.next();

        System.out.println("Enter the calories for each food: ");
        cal1 = scan.nextDouble();
        cal2 = scan.nextDouble();
        cal3 = scan.nextDouble();

        totalCal = cal1 + cal2 + cal3;

        System.out.println("1. " + food1 + " - " + cal1 + " calories");
        System.out.println("2. " + food2 + " - " + cal2 + " calories");
        System.out.println("3. " + food3 + " - " + cal3 + " calories");
        System.out.println("Total Calories: " + totalCal);

        scan.close();
    }
}
