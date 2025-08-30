import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Scramble {
    public static void main(String[] args) {
        Random num = new Random();
        Scanner myScan = new Scanner(System.in);
        int playerScore = 0;
        boolean keepPlaying = true;
        String[] words = {"magic", "wizard", "spell", "potion", "alchemy",
                "sorcery", "wand", "dragon", "cauldron", "broomstick"};


        System.out.println("Welcome to the Scamble Wizard!");
        System.out.println("Unscramble  the magic  words to score points!");

        while (keepPlaying){
            String chosenWord = words[num.nextInt(words.length)];
            String scrWord = scrambleWord(chosenWord, num);
            System.out.println("Scrambled word: " + scrWord);
            boolean wordGuessed = false;
            int attempts = 3;

            while (attempts > 0 && !wordGuessed) {
                System.out.println("Your guess: ");
                String playerGuess = myScan.nextLine();

                if (playerGuess.equalsIgnoreCase(chosenWord)) {
                    System.out.println("Correct! You've unscrambled the word!");
                    playerScore++;
                    wordGuessed = true;
                } else {
                    attempts--;
                    System.out.println("Wrong! Attempts remaining: " + attempts);
                }

            }

            if (!wordGuessed){
                System.out.println("The correct word was: " + chosenWord);
            }
            System.out.println("Your current score: " + playerScore);

            System.out.println("Do you want to play again? (yes/no): ");
            String response = myScan.nextLine();
            keepPlaying = response.equalsIgnoreCase("yes");
        }
        System.out.println("Your final score: " + playerScore);

        myScan.close();
    }

    public static String scrambleWord(String word, Random random){
        char[] letters = word.toCharArray();
        for (int i = 0; i < letters.length; i++){
            int j = random.nextInt(letters.length);
            char temp = letters[i];
            letters[i] = letters[j];
            letters[j] = temp;
        }
        return new String(letters);
    }
}
