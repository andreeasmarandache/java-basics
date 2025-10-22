public class ForEachExample {
    public static void main(String[] args) {
        // Un array cu numele browserelor pe care vom rula testele
        String[] browsere = {"Chrome", "Firefox", "Edge", "Safari"};

        System.out.println("Testele se vor rula pe urmatoarele browsere:");

        for (String browser : browsere) {
            System.out.println("- " + browser);
        }

    }

}
