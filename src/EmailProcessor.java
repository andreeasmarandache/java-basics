public class EmailProcessor {
    public static void main(String[] args) {
        String email = "nume.prenume@test.com";

        // Verifică dacă conține "@"
        System.out.println("Este un email valid? " + email.contains("@"));

        // Găsește indexul lui "@"
        int atIndex = email.indexOf("@");

        // Extrage username-ul
        String username = email.substring(0, atIndex);

        // Afișează cu majuscule
        System.out.println("Username: " + username.toUpperCase()); // Output: NUME.PRENUME
    }

}
