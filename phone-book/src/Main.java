import org.william.repository.PhoneBookRepository;
import org.william.service.PhoneBookService;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean exit = false;

        PhoneBookService phoneBookService = new PhoneBookService();
        PhoneBookRepository phoneBookRepository = new PhoneBookRepository();
        Scanner scanner = new Scanner(System.in);

        try (scanner) {
            while (!exit) {
                System.out.println("Name:");
                String nameOption = scanner.next();
                System.out.println("Number:");
                String cellphoneOption = scanner.next();
                phoneBookService.addPerson(nameOption, cellphoneOption);

                System.out.println("Exit? Y/N");
                String optionExit = scanner.next().toUpperCase();

                if (optionExit.contains("Y")) {
                    phoneBookService.getPerson();
                    phoneBookRepository.writeFile();
                    exit = true;
                }
            }
        }
    }
}