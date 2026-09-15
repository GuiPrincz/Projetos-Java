
import java.util.Locale;
import java.util.Scanner;

public class projeto8{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutos;
        minutos = sc.nextInt();

        if (minutos <= 100){
            System.out.println("Valor a pagar: R$ " + (minutos * 2.00));
        } else if (minutos <= 200){
            System.out.println("Valor a pagar: R$ " + (100 * 2.00 + (minutos - 100) * 1.50));
        } else {
            System.out.println("Valor a pagar: R$ " + (100 * 2.00 + 100 * 1.50 + (minutos - 200) * 1.00));
        }
    }
}