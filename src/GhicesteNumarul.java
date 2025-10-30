import java.util.Scanner;

public class GhicesteNumarul {public static void main(String[] args) {
    int numarSecret = 7;
    int numarGhicit = 0;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ghiceste numarul secret intre 1 si 10!");

    while (numarGhicit != numarSecret) {
        System.out.print("Introdu numarul tau: ");
        numarGhicit = scanner.nextInt();
    }

    System.out.println("Felicitari! Ai ghicit numarul secret: " + numarSecret);
    scanner.close();
}

}
