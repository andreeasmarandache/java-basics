public class TablaInmultirii {
    public static void main(String[] args) {
        // Bucla exterioara itereaza prin numerele de la 1 la 10 (deînmulțitul)
        for (int i = 1; i <= 10; i++) {
            // Bucla interioara itereaza si ea de la 1 la 10 (înmulțitorul)
            for (int j = 1; j <= 10; j++) {
                // System.out.print in loc de println pentru a afisa pe aceeasi linie
                System.out.print(i * j + "\t"); // "\t" adauga un spatiu de tip Tab
            }
            // Dupa ce bucla interioara a terminat, trecem la linia urmatoare
            System.out.println();
        }
    }

}
