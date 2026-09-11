
public class projeto6 {
    public static void main(String[] args) {

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.println("A raiz quadrada de " + x + " é: " + A);
        System.out.println("A raiz quadrada de " + y + " é: " + B);
        System.out.println("A raiz quadrada de 25 é: " + C);

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(y, 2.0);
        System.out.println("A potência de " + x + " elevado a " + y + " é: " + A);
        System.out.println("A potência de " + x + " elevado a 2 é: " + B);
        System.out.println("A potência de " + y + " elevado a 2 é: " + C);

        A = Math.abs(z);
        B = Math.abs(y);
        System.out.println("O valor absoluto de " + z + " é: " + A);
        System.out.println("O valor absoluto de " + y + " é: " + B);

    }
}