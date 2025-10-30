public class VerificareStatusuri {
    public static void main(String[] args) {
        String[] statusuri = {"PASSED", "FAILED", "PASSED", "SKIPPED", "PASSED"};
        int numarPassed = 0;

        for (String status : statusuri) {
            if (status.equals("PASSED")) {
                numarPassed++;
            }
        }
        System.out.println("Numarul de teste trecute: " + numarPassed);
    }

}
