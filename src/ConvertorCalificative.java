public class ConvertorCalificative {
    public static void main(String[] args) {
        char calificativ = 'B';
        String mesaj;

        switch (calificativ) {
            case 'A':
                mesaj = "Excelent!";
                break;
            case 'B':
                mesaj = "Foarte Bine!";
                break;
            case 'C':
                mesaj = "Bine";
                break;
            case 'D':
                mesaj = "Suficient";
                break;
            case 'F':
                mesaj = "Insuficient";
                break;
            default:
                mesaj = "Calificativ invalid!";
                break;
        }
        System.out.println("Feedback: " + mesaj);
    }

}
