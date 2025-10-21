public class CalculTVA {
    public static void main(String[] args) {
        double pretInitial = 100.0;
        double cotaTVA = 0.19; // 19%
        double valoareTVA = pretInitial * cotaTVA; // Aici e bug-ul!
        double pretFinal = pretInitial + valoareTVA;

        System.out.println("Pretul final este: " + pretFinal);
    }

}
