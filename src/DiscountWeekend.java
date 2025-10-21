public class DiscountWeekend {
    public static void main(String[] args) {
        boolean esteWeekend = true;
        boolean esteClientFidel = false;

        if (esteWeekend && esteClientFidel) {
            System.out.println("Se acorda discount de weekend!");
        } else {
            System.out.println("Nu se acorda discount.");
        }
    }
}
