public class EmailSearch {
    public static boolean findEmail(String[] emails, String emailToFind) {
        for (String email : emails) {
            if (email.equalsIgnoreCase(emailToFind)) {
                return true; // Am gasit, iesim imediat din metoda
            }
        }
        return false; // Am terminat bucla, deci nu l-am gasit
    }

    public static void main(String[] args) {
        String[] emailList = {"ana@test.com", "bogdan@test.com", "vlad@test.com"};
        System.out.println(findEmail(emailList, "bogdan@test.com")); // true
        System.out.println(findEmail(emailList, "mihai@test.com"));  // false
    }

}
