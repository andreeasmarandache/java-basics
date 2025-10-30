public class DrawTriangle {
    public static void main(String[] args) {
        int numarRanduri = 5;
        for (int i = 1; i <= numarRanduri; i++) { // Bucla pentru randuri
            for (int j = 1; j <= i; j++) { // Bucla pentru coloane (depinde de randul 'i')
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

