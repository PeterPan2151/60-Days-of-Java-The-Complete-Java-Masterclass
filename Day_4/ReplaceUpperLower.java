public class ReplaceUpperLower {
    public static void main(String[] args) {
        String phrase = "The quick brown fox";

        String newPhrase = phrase.replace('o', 'a');

        System.out.println("Original phrase: " + phrase);
        System.out.println("New phrase: " + newPhrase);

        String upperCaseString = phrase.toUpperCase();
        System.out.println(upperCaseString);
    }
}
