import java.util.Scanner;

public class Astronout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] astronautNames = new String[10];
        int[] astronautAges = new int[10];
        String[] missionStatus = new String[10];
        int numAstronauts = 0;

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add astronaut to mission");
            System.out.println("2. Update astronaut's mission status");
            System.out.println("3. Display all astronauts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");


            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter astronaut's name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter astronaut's age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter mission status (On mission / Available): ");
                    String status = scanner.nextLine();

                    astronautNames[numAstronauts] = name;
                    astronautAges[numAstronauts] = age;
                    missionStatus[numAstronauts] = status;
                    numAstronauts++;

                    System.out.println(name + " added to the mission.");
                    break;

                case 2:
                    System.out.print("Enter astronaut's name to update status: ");
                    String astronautName = scanner.nextLine();
                    boolean found = false;

                    for (int i = 0; i < numAstronauts; i++) {
                        if (astronautNames[i].equals(astronautName)) {
                            System.out.print("Enter new mission status (On mission / Available): ");
                            missionStatus[i] = scanner.nextLine();
                            System.out.println("Mission status updated for " + astronautName);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Astronaut not found in the mission.");
                    }
                    break;

                case 3:
                    System.out.println("All Astronauts:");
                    if (numAstronauts == 0) {
                        System.out.println("No astronauts added to the mission yet.");
                    } else {
                        for (int i = 0; i < numAstronauts; i++) {
                            System.out.println("Name: " + astronautNames[i] + ", Age: " + astronautAges[i] + ", Status: " + missionStatus[i]);
                        }
                    }
                    break;

                case 4:
                    // Exit program
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
            }
            System.out.println(); // For better readability
        }
    }
}
