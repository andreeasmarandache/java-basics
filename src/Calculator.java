public class Calculator {
    public static void main(String[] args) {
        double a = 10;
        double b = 5;
        char operator = '*';
        double rezultat = 0;

        switch (operator) {
            case '+':
                rezultat = a + b;
                break;
            case '-':
                rezultat = a - b;
                break;
            case '*':
                rezultat = a * b;
                break;
            case '/':
                rezultat = a / b;
                break;
            default:
                System.out.println("Operator invalid!");
                return;
        }
        System.out.println("Rezultatul este: " + rezultat);
    }

}
