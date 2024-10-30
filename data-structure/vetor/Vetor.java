import java.util.ArrayList;
import java.util.Scanner;

class Vetor {
    public static void main(String[] args) {
        // vetor int
        // vetor estatico
        int[] vetor = new int[10];
        vetor[0] = 50;
        vetor[1] = 51;
        System.out.println(vetor[0]);
        
        ArrayList<Integer> array = new ArrayList<>();
        
        array.add(200);
        array.add(210);
        System.out.println(array);
        System.out.println(array.get(1));
        
        // vetor String
        String[] vetorString = new String[3];
        vetorString[0] = "Apple";
        vetorString[1] = "Banana";
        vetorString[2] = "Kiwi";
        
        System.out.println(vetorString[0]);
        
        for (int i = 0; i < vetorString.length; i++) {
            System.out.println(vetorString[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma fruta para busca");
        String opt = scanner.nextLine();
        
        
        boolean found = false;
        for (int i = 0; i < vetorString.length; i++) {
            if (opt.equals(vetorString[i])) {
                found = true;
                break;
            }
        }
        
        System.out.println(found ? "Achou" : "Nao achou");
    }
}