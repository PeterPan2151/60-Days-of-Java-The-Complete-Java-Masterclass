import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vowels = 0, consonants = 0;
        String vowelsList = "aeiouAEIOU";

        while (true) {
            System.out.println("Enter a string:");
            String input = scanner.nextLine();

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);


                if (!Character.isLetter(ch)) {
                    continue;
                }


                if (vowelsList.indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
            System.out.println("Do you want to continue? (yes to continue, no to exit)");
            String userChoice = scanner.nextLine();

            if (userChoice.equalsIgnoreCase("no")) {
                break;
            }

        }

        System.out.println("Total vowels: " + vowels);
        System.out.println("Total consonants: " + consonants);

        scanner.close();
    }
}
