import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    boolean exit = false;
        
    Account account = new Account();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Whats your name?");
    String newName = scanner.next();

    System.out.println("Whats your agency?");
    int newAgency = scanner.nextInt();

    System.out.println("Whats your number account?");
    int newAccount = scanner.nextInt();

    account.setName(newName);
    account.setAgency(newAgency);
    account.setNumberAccount(newAccount);

    System.out.println("Hello " + account.nameClient + " your agency is " + account.agency + ", your number account is " + account.numberAccount + " and your balance is " + account.balance);

    while (!exit) {
            System.out.println("1 Exit || 2 Set Balance");
            int option = scanner.nextInt();

            if (option == 1) {
                exit = true;
            } else if (option == 2) {
                System.out.println("Set your balance");
                double newBalance = scanner.nextDouble();

                account.setBalance(newBalance);
                System.out.println(account.balance);
            }
        }
    }
}
