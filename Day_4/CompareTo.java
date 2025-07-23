public class CompareTo {
    public static void main(String[] args) {
        String animal1 = "Cat";
        String animal2 = "Dog";
        String animal3 = "Cat";

        System.out.println("Comapring animal1 to animal2 using CompareTo() " + animal1.compareTo(animal2));
        System.out.println("Comapring animal1 to animal3 using CompareTo() " + animal1.compareTo(animal3));
        System.out.println("Comapring animal2 to animal3 using CompareTo() " + animal2.compareTo(animal3));
    }
}
