import org.william.service.BallotBoxService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean exit = false;

        BallotBoxService ballotBoxService = new BallotBoxService();
        ballotBoxService.addCandidate();
        Scanner scanner = new Scanner(System.in);

        try (scanner) {
            while(!exit) {
                System.out.println("Donald | Joe");
                String optionCandidate = scanner.next().toUpperCase();
                ballotBoxService.voteCandidate(optionCandidate);
                ballotBoxService.getCandidate();

                System.out.println("Vote Again? Y | N");
                String optionVoteAgain = scanner.next().toUpperCase();

                if (optionVoteAgain.contains("N")) {
                    exit = true;
                }
            }
        }
    }
}