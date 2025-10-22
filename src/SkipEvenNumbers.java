public class SkipEvenNumbers {
    public static void main(String[] args) {
        System.out.println("Numerele impare de la 1 la 10 sunt:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Daca numarul este par, sari peste System.out.println
            }
            System.out.println(i);
        }
    }

}
