import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         int i;
         int n = 10;
         for (i = 1; i <=10 ;i++) {
             System.out.println(n * i);
         }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 Grade");
            int grade1 = Integer.parseInt(scanner.nextLine());

            System.out.println("2 Grade");
            int grade2 = Integer.parseInt(scanner.nextLine());

            int result = (grade1 + grade2) / 2;
            System.out.println(result);

            if (result >= 5) {
                System.out.println("the student was approved");
            } else {
                System.out.println("The student has failed");
            }

            System.out.println("Continue?");
            String op = scanner.nextLine();

            if ("n".contains(op)) {
                break;
            }
        }

        int h = 0;
        for (i = 1; i<=5; i++) {
            System.out.println("Enter the student's height " + i);
            int op = Integer.parseInt(scanner.nextLine());

            if (op >= h) {
                h = op;
            }
        }

        System.out.println(h);
        System.out.println(i);
    }
}