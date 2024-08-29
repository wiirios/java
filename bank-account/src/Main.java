import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
    }
}