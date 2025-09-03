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

        if (choice == 1){
            String encodedString = encode(text, 0);
            System.out.println(encodedString);
        } else if (choice == 2) {
            String decodedString = decode(text, 0);
            System.out.println(decodedString);
        } else {
            System.out.println("Invalid choice");
        }
    }


    public static String encode(String input, int index) {
        if (index == input.length()) {
            return "";
        }
        char ch = input.charAt(index);
        char encodedChar = atbash(ch);

        return encodedChar + encode(input, index + 1);
    }


    public static String decode(String input, int index){
        return encode(input, index);
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
