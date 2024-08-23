import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random r = new Random();
        System.out.println(r.nextInt(500));

        // OR

        double rnd = Math.random() * 31  + 1;
        System.out.println((int)rnd);

        // random char

        char c = (char) ('a' + r.nextInt(26));
        System.out.println(c);
    }
}
