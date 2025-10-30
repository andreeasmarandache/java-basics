public class FindFreeSeat {
    public static void main(String[] args) {
        int[][] locuri = {
                {1, 1, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {0, 1, 1, 1, 0}
        };

        boolean locGasit = false;

        System.out.println("Cautam primul loc liber...");

        for (int i = 0; i < locuri.length; i++) { // Itereaza prin randuri
            for (int j = 0; j < locuri[i].length; j++) { // Itereaza prin coloane
                if (locuri[i][j] == 0) {
                    System.out.println("Primul loc liber este la randul " + (i+1) + ", locul " + (j+1));
                    locGasit = true;
                    break; // Iesim din bucla interioara
                }
            }
            if (locGasit) {
                break; // Iesim si din bucla exterioara
            }
        }
    }

}
