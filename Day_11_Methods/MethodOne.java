import java.sql.SQLOutput;
import java.util.Scanner;

public class MethodOne {
    public static void main(String[] args) {
        SayHello();

        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = myScan.nextLine();

        SayHelloName(name);
    }

    public static void SayHello(){
        System.out.println("Hellooooo");
    }

    public static void SayHelloName(String name){
        System.out.println("Hello " + name);
    }


}
