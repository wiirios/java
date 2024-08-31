import java.util.Scanner;

// Working

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Client client = new Client("William", 2000);

        Smartphone smartphone = new Smartphone("Samsung M14", "Samsung", "M14", "Android", 64, 4, 1000);

        // Smartphone smartphone = new Smartphone();
        // smartphone.brand = "Samsung";
        // smartphone.model = "M14";
        // smartphone.os = "Android";
        // smartphone.memory = 64;
        // smartphone.memoryRam = 4;

        Smartphone smartphoneTwo = new Smartphone("Samsung A04", "Samsung", "A04", "Android", 64, 4, 1200);
        
        // Smartphone smartphoneTwo = new Smartphone();
        // smartphoneTwo.brand = "Samsung";
        // smartphoneTwo.model = "A04";
        // smartphoneTwo.os = "Android";
        // smartphoneTwo.memory = 64;
        // smartphoneTwo.memoryRam = 4;
        
        Smartphone smartphoneThird = new Smartphone("Iphone X", "Apple", "X", "IOS", 124, 8, 2000);

        // Smartphone smartphoneThird = new Smartphone();
        // smartphoneThird.brand = "Iphone";
        // smartphoneThird.model = "X";
        // smartphoneThird.os = "IOS";
        // smartphoneThird.memory = 124;
        // smartphoneThird.memoryRam = 8;

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
        
//      if (1.contains(choice)) only works with 'String' if ("1".contains(choice)) ...

        if (choice == 1) {
            client.withdrawBalance(smartphone.price);
        }
    }
}
