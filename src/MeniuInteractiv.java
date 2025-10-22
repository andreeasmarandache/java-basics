import java.util.Scanner;

public class MeniuInteractiv {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int optiune;

            do {
                System.out.println("\n--- MENIU ---");
                System.out.println("1. Ruleaza testele de API");
                System.out.println("2. Ruleaza testele de UI");
                System.out.println("0. Iesire");
                System.out.print("Alege o optiune: ");

                optiune = scanner.nextInt();

                if (optiune == 1) {
                    System.out.println("Se ruleaza testele de API...");
                } else if (optiune == 2) {
                    System.out.println("Se ruleaza testele de UI...");
                }

            } while (optiune != 0);

            System.out.println("Programul s-a incheiat.");
            scanner.close();
        }

    }
