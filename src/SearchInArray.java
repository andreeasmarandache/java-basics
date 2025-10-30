public class SearchInArray {
    public static boolean containsNumber(int[] array, int numberToFind) {
        for (int element : array) {
            if (element == numberToFind) {
                return true; // Am gasit numarul, iesim din metoda cu rezultatul 'true'
            }
        }
        // Daca am terminat bucla si nu am gasit nimic, iesim cu 'false'
        return false;
    }

    public static void main(String[] args) {
        int[] data = {5, 12, 99, 8};
        boolean found = containsNumber(data, 99);
        System.out.println("Numarul 99 a fost gasit? " + found); // Va afisa true

        found = containsNumber(data, 100);
        System.out.println("Numarul 100 a fost gasit? " + found); // Va afisa false
    }

}
