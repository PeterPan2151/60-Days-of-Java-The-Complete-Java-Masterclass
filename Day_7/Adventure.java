import java.util.Scanner;

public class Adventure {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Hello, welcome to th adventure game, your goal is to find the hidden treasure");
        System.out.println("You are running through a hill, and the you come to a cross road, choose a path to keep running: left OR right");
        String option1 = myScan.nextLine();
        switch (option1) {
            case "left":
                System.out.println("You come to a river, choose: wait OR swim");
                String option2 = myScan.nextLine();
                switch (option2) {
                    case "wait":
                        System.out.println("You finally crossed the river, and fou find 2 trap doors, one red on blue, choose: red OR blue");
                        String option3 = myScan.nextLine();
                        switch (option3) {
                            case "red":
                                System.out.println("It was a trap, game over");
                                break;
                            case "blue":
                                System.out.println("You found the treasure, congrats!!");
                                break;
                            default:
                                System.out.println("Invalid option");
                                break;
                        }
                        break;
                    case "swim":
                        System.out.println("You got eaten by sharks, game over");
                        break;
                    default:
                        System.out.println("Invalid option");
                        break;
                }
                break;
            case "right":
                System.out.println("You kept running but then you fell off a cliff, game over");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }

        myScan.close();
    }
}
