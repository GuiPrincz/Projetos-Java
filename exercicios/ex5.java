
import java.util.Locale;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double cod1, cod2, qtd1, qtd2, valor1, valor2, total;
        cod1 = sc.nextDouble();
        qtd1 = sc.nextDouble();
        valor1 = sc.nextDouble();

        cod2 = sc.nextDouble();
        qtd2 = sc.nextDouble();
        valor2 = sc.nextDouble();

        total = (qtd1 * valor1) + (qtd2 * valor2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
    }
}