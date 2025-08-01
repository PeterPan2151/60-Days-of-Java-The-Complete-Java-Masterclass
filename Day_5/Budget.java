import java.util.Scanner;

public class Budget {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.println("What is you monthly income? ");
        double income = myScan.nextDouble();

        System.out.println("How much do you spent in Rent? ");
        double rent = myScan.nextDouble();

        System.out.println("How much do you spent in Groceries? ");
        double groceries = myScan.nextDouble();

        System.out.println("How much do you spent in Transportation? ");
        double transportation = myScan.nextDouble();

        System.out.println("How much do you spent in Entertainment? ");
        double entertainment = myScan.nextDouble();

        double totalExpenses = rent + groceries + transportation + entertainment;
        double remainingBudget = income - totalExpenses;

        double rentPercentage = (rent * 100) / income;
        double groceriesPercentage = (groceries * 100) / income;
        double transportationPercentage = (transportation * 100) / income;
        double entertainmentPercentage = (entertainment * 100) / income;

        System.out.println("\n********** Budget Summary **********");
        System.out.printf("Monthly Income: $%.2f\n", income);
        System.out.printf("Total Expenses: $%.2f\n", totalExpenses);
        System.out.printf("Remaining Budget: $%.2f\n", remainingBudget);
        System.out.println("Expenses Breakdown:");
        System.out.printf("  Rent: $%.2f (%.2f%% of income)\n", rent, rentPercentage);
        System.out.printf("  Groceries: $%.2f (%.2f%% of income)\n", groceries, groceriesPercentage);
        System.out.printf("  Transportation: $%.2f (%.2f%% of income)\n", transportation, transportationPercentage);
        System.out.printf("  Entertainment: $%.2f (%.2f%% of income)\n", entertainment, entertainmentPercentage);
        System.out.println("************************************");

        myScan.close();
    }
}
