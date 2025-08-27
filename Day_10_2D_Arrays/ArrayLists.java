import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Dates");

        for (String fruit: fruits){
            System.out.println(fruit);
        }

        fruits.contains("Banana");
    }
}
