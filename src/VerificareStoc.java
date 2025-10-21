public class VerificareStoc {
    public static void main(String[] args) {
        int numarProduseInStoc = 0;

        String statusStoc = (numarProduseInStoc > 0) ? "In stoc" : "Stoc epuizat";

        System.out.println("Status produs: " + statusStoc);

        // Testeaza si cu numarProduseInStoc = 0;
    }
}
