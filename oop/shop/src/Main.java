import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Client client = new Client("William", 2000);

        Smartphone smartphone = new Smartphone("Samsung M14", "Samsung", "M14", "Android", 64, 4, 1000);

        Smartphone smartphoneTwo = new Smartphone("Samsung A04", "Samsung", "A04", "Android", 64, 4, 1200);
        
        Smartphone smartphoneThird = new Smartphone("Iphone X", "Apple", "X", "IOS", 124, 8, 2000);

        String[] array = {
                smartphone.comercialName,
                smartphoneTwo.comercialName,
                smartphoneThird.comercialName
        };

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("Choice one to buy");
        int choice = scanner.nextInt();

        if (choice == 1) {
            client.withdrawBalance(smartphone.price);
        }
    }
}
