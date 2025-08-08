import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter a planet name (Earth, Mars, Venus or Jupiter): ");
        String planet = myScan.nextLine().toLowerCase().trim();

        System.out.println("Please enter the current temperature in Celsius:");
        double temp = myScan.nextDouble();

        String advice = "";
        if (planet.equals("earth")) {
            if (temp < 0) {
                advice = "It's freezing on Earth! Wear a heavy coat.";
            } else if (temp < 15) {
                advice = "It's quite chilly on Earth. Wear a jacket.";
            } else if (temp < 25) {
                advice = "The weather on Earth is pleasant. A light sweater should be enough.";
            } else {
                advice = "It's warm on Earth. Wear something light!";
            }
        } else if (planet.equals("mars")) {
            if (temp < -60) {
                advice = "It's extremely cold on Mars! Wear a space suit with thermal insulation.";
            } else if (temp < 0) {
                advice = "It's very cold on Mars. Wear a thermal suit.";
            } else {
                advice = "It's unusually warm on Mars. Enjoy the rare warmth!";
            }
        } else if (planet.equals("venus")) {
            if (temp < 400) {
                advice = "It's incredibly hot on Venus! Stay indoors with air conditioning.";
            } else {
                advice = "It's scorching hot on Venus. Avoid going outside!";
            }
        } else if (planet.equals("jupiter")) {
            if (temp < -100) {
                advice = "It's freezing on Jupiter! Stay in your heated space module.";
            } else if (temp < -50) {
                advice = "It's very cold on Jupiter. Wear a thermal space suit.";
            } else {
                advice = "It's surprisingly warm on Jupiter. Enjoy the pleasant temperature!";
            }
        } else {
            advice = "Unknown planet! Please enter a valid planet name.";
        }


        System.out.println(advice);

        myScan.close();
    }
}
