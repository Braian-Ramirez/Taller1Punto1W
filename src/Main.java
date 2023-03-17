
public class Main {
    public static void main(String[] args) {
        int numero, factorial;
        factorial = numero = 1;

        try {
            while (numero <= 10) {
                factorial = factorial * numero;
                System.out.println("El factorial del número " + numero + " es: " + factorial);
                numero++;
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}