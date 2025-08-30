import java.util.Scanner;

public class Sandwich {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter the number of slices of cheese: ");
        makeSandwich(myScan.nextInt());

        myScan.close();
    }

    public static void makeSandwich(int slicesOfCheese){
        System.out.println("Take 2 slices of bread");
        System.out.println("Spread butter on one slice");
        for (int i = 0; i < slicesOfCheese; i++){
            System.out.println("Add a slice of cheese");
        }
        System.out.println("Put the second slice of bread on top.");
        System.out.println("Sandwich is ready!");
    }
}
