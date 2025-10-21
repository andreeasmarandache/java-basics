public class EligibilityValidator {
    public static void main(String[] args) {
        // --- Datele de intrare pentru candidatul nostru ---
        String numeCandidat = "Alex Popescu";
        int varsta = 16;
        double venitLunar = 1500;
        boolean estePeListaNeagra = true;

        System.out.println("Se verifica eligibilitatea pentru: " + numeCandidat);
        System.out.println("------------------------------------");

        // --- Logica de validare ---
        if (varsta >= 18 && venitLunar >= 2500 && !estePeListaNeagra) {
            // Daca TOATE condițiile sunt îndeplinite
            String mesajAprobare = String.format(
                    "Felicitari, %s! Sunteti eligibil pentru un credit.",
                    numeCandidat
            );
            System.out.println(mesajAprobare);
        } else {
            // Daca cel puțin O CONDIȚIE nu este îndeplinită
            System.out.println("Ne pare rau, nu sunteti eligibil in acest moment.");

            // Oferim feedback detaliat folosind if-uri separate
            if (varsta < 18) {
                System.out.println("- Motiv: Varsta minima este de 18 ani.");
            }
            if (venitLunar < 2500) {
                System.out.println("- Motiv: Venitul minim necesar este de 2500 RON.");
            }
            if (estePeListaNeagra) {
                System.out.println("- Motiv: Figurati in baza de date a datornicilor.");
            }
        }


    }
}
