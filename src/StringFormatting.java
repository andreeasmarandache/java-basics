public class StringFormatting {
    public static void main(String[] args) {
        String numeProdus = "Laptop Pro";
        int cantitate = 2;
        double pret = 4599.99;

        // %s - pentru String, %d - pentru numere întregi (decimal), %.2f - pentru double cu 2 zecimale
        String raport = String.format("Ati comandat %d bucati de %s la pretul de %.2f RON.", cantitate, numeProdus, pret);

        System.out.println(raport);
        // Output: Ati comandat 2 bucati de Laptop Pro la pretul de 4599.99 RON.
    }
}
