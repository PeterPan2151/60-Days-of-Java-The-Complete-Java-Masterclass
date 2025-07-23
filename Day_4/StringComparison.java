public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("java");

        // comparing references
        System.out.println("Comparing str1 and str2 using == " + (str1 == str2));
        System.out.println("Comparing str1 and str3 using == " + (str1 == str3));

        // Comparing the values of variables
        System.out.println("Comparing str1 and str2 using equals() " + (str1.equals(str2)));
        System.out.println("Comparing str1 and str3 using equals() " + (str1.equals(str3)));

        // We ignore the letter case
        System.out.println("Comparing str1 and str2 using equalsIgnoreCase() " + (str1.equalsIgnoreCase(str3)));
        System.out.println("Comparing str1 and str3 using equalsIgnorecase() " + (str1.equalsIgnoreCase(str3)));

    }
}
