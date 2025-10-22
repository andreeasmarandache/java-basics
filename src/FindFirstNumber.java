public class FindFirstNumber {
    public static void main(String[] args) {
        int[] numere = {12, 5, 23, 49, 18, 56, 33};
        int numarGasit = -1;

        for (int numar : numere) {
            System.out.println("Verific numarul: " + numar);
            if (numar % 7 == 0) {
                numarGasit = numar;
                break; // Am gasit ce cautam, nu are rost sa mai continuam.
            }
        }

        if (numarGasit != -1) {
            System.out.println("Primul numar divizibil cu 7 este: " + numarGasit);
        } else {
            System.out.println("Nu a fost gasit niciun numar divizibil cu 7.");
        }
    }

}
