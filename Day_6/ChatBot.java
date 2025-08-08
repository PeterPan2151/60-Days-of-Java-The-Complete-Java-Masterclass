import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String greeting = myScan.nextLine();
        if (greeting.equals("hello") || greeting.equals("hi")) {
            System.out.println("Hello! How can I help you today?");
            String question = myScan.nextLine();
            if (question.equals("how are you") || question.equals("how’s it going")) {
                System.out.println("I'm just a bot, but I'm here to help you!");

            } else if (question.equals("what’s the weather like") || question.equals("weather")) {
                System.out.println("I don’t have real-time weather data, but it's always sunny in the digital world!");
            } else if (question.equals("bye") || question.equals("goodbye")) {
                System.out.println("Goodbye! Have a great day!");
            }
        }

        myScan.close();
    }
}
