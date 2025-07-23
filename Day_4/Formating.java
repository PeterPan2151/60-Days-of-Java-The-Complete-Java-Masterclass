public class Formating {
    public static void main(String[] args) {
        String name = "Alice";
        int age = 30;
        String mesage = String.format("Hello, %s! You are %d years old", name, age);
        System.out.println(mesage);

        double price = 1234.567;
        String formattedPrice = String.format("The price is $%.2f", price);
        System.out.println(formattedPrice);
    }
}
