public class StringMethods {
    public static void main(String[] args) {
        String propozitie = "Acesta este un text de test.";

        // 1. Aflarea lungimii
        System.out.println("Lungimea este: " + propozitie.length()); // Output: 28

        // 2. Conversia la majuscule/minuscule
        System.out.println(propozitie.toUpperCase()); // "ACESTA ESTE UN TEXT DE TEST."
        System.out.println(propozitie.toLowerCase()); // "acesta este un text de test."

        // 3. Verificarea dacă conține un sub-text (foarte util în teste!)
        boolean contineTest = propozitie.contains("test");
        System.out.println("Contine cuvantul 'test'? " + contineTest); // true

        // 4. Extragerea unui sub-text (substring)
        // Extrage textul de la indexul 15 până la final
        String cuvant = propozitie.substring(15);
        System.out.println(cuvant); // "text de test."
    }
}
