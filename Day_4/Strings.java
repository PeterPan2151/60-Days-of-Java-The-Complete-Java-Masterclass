public class Strings {
    public static void main(String[] args) {
        String morning = "Good Morning";
        System.out.println(morning);

        String night = new String("Good night");
        System.out.println(night);

        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        int age = 30;
        String bio = "I am " + fullName + " and I am " + age + " years old";
        System.out.println(bio);
    }
}