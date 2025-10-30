import java.util.Scanner;

public class ValidareParola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String parola;

        do {
            System.out.print("Introdu o parola (minim 8 caractere): ");
            parola = scanner.nextLine();
        } while (parola.length() < 8);

        System.out.println("Parola acceptata!");
        scanner.close();
    }

}
