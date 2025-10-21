public class VerificareNota {
    public static void main(String[] args) {
        int nota = 8;

        if (nota >= 5) {
            System.out.println("Felicitari! Ai promovat examenul.");
        } else {
            System.out.println("Ne pare rau, ai picat. Mai incearca!");
        }

        // Exemplu cu else-if
        int scor = 90;
        char calificativ;

        if (scor >= 90) {
            calificativ = 'A';
        } else if (scor >= 80) {
            calificativ = 'B';
        } else if (scor >= 70) {
            calificativ = 'C';
        } else {
            calificativ = 'D';
        }
        System.out.println("Calificativul tau este: " + calificativ); // Output: B
    }

}
