
import java.util.Locale;
import java.util.Scanner;

public class ex3{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i =0; i<num; i++){
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();

            double media = (a*2 + b*3 + c*5) / 10;
            System.out.printf("%.1f\n", media);
        }

    }
}