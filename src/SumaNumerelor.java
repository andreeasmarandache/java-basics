public class SumaNumerelor {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i; // Echivalent cu suma = suma + i;
        }
        System.out.println("Suma numerelor de la 1 la 100 este: " + suma);
    }

}
