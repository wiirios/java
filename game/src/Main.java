import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r = Math.random() * 3 + 1;
        int rInt = (int)r;

        System.out.println("1 - ROCK || 2 - PAPER || 3 - SCISSORS");

        Scanner scanner = new Scanner(System.in);
        String myChoice = scanner.nextLine();
        int myChoiceInt = Integer.parseInt((myChoice));

        if (myChoiceInt == rInt) {
            System.out.println("DRAW");
        }
        else if (myChoiceInt == 1 && rInt == 3 || myChoiceInt == 2 && rInt == 1 || myChoiceInt == 3 && rInt == 2) {
            System.out.println("Player Win!");
        }
        else {
            System.out.println("CPU Win!");
        }
    }
}