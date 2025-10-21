public class ZiuaSaptamanii {
    public static void main(String[] args) {
        int ziua = 3;
        String numeZi;

        switch (ziua) {
            case 1:
                numeZi = "Luni";
                break;
            case 2:
                numeZi = "Marti";
                break;
            case 3:
                numeZi = "Miercuri";
                break;
            case 4:
                numeZi = "Joi";
                break;
            case 5:
                numeZi = "Vineri";
                break;
            default:
                numeZi = "Weekend";
                break;
        }
        System.out.println("Astazi este: " + numeZi); // Output: Miercuri
    }

}
