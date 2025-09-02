import java.util.Scanner;

public class SecretLanguage {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.println("Welcome to the Encoder-Decoder game!");
        System.out.println("1. Encode a string");
        System.out.println("2. Decode a string");
        System.out.println("Choose an option (1 or 2): ");

        int choice = myScan.nextInt();
        myScan.nextLine();

        System.out.println("Enter the string: ");
        String text = myScan.nextLine();
    }

    public static char atbash(char ch){
        if (ch >= 'a' && ch <= 'z') {
            return (char) ('z' - (ch -'a'));
        } else if (ch >= 'A' && ch <= 'Z') {
            return (char) ('Z' - (ch -'A'));
        } else {
            return ch;
        }
    }
}
