import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        System.out.println(randomNumber());
        System.out.println(randomNumber());
        System.out.println(randomNumber());
    }

    public static int randomNumber(){
        Random random = new Random();
        return random.nextInt(1, 10);
    }
}
