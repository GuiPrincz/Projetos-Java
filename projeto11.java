
import java.util.Scanner;

public class projeto11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int soma = 0;

        for (int i = 0; i < num; i++) {
            int x = scanner.nextInt();
            soma += x;
        }
        System.out.println("Soma: " + soma);
    }
}