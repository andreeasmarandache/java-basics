public class AnBisect {
    public static void main(String[] args) {
        int an = 2024;
        boolean esteBisect = (an % 4 == 0 && an % 100 != 0) || (an % 400 == 0);

        if (esteBisect) {
            System.out.println(an + " este un an bisect.");
        } else {
            System.out.println(an + " nu este un an bisect.");
        }
    }
}
