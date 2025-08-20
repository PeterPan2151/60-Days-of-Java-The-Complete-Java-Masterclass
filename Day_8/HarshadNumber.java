import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int userInputNum;
        System.out.println("Please enter a number: ");
        userInputNum = myScan.nextInt();

        int originalNumber = userInputNum;
        int sumOfDigits = 0;


        while (userInputNum > 0){
            sumOfDigits += userInputNum % 10;
            userInputNum /= 10;
        }

        if (originalNumber % sumOfDigits == 0) {
            System.out.println("Number is a Harshad Number");
        } else {
            System.out.println("The number isn't a Harshad number");
        }
    }
}
