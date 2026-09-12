
import java.util.Locale;
import java.util.Scanner;

public class ex4{

    public static void main (String[] args){
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            int horas = sc.nextInt();
            int valor = sc.nextInt();
            double hora = sc.nextDouble();

            double salario = valor * hora;
            System.out.printf("NUMBER = %d\n", horas);
            System.out.printf("SALARY = U$ %.2f\n", salario);
    }
}