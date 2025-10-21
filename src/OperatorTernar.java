public class OperatorTernar {
    public static void main(String[] args) {
        int varsta = 20;
        String tipClient;

        // Varianta clasică if-else
        if (varsta >= 18) {
            tipClient = "Adult";
        } else {
            tipClient = "Minor";
        }

        // Varianta cu operator ternar - face exact același lucru
        String tipClientTernar = (varsta >= 18) ? "Adult" : "Minor";

        System.out.println("Tip client (if-else): " + tipClient);
        System.out.println("Tip client (ternar): " + tipClientTernar);
    }
}
