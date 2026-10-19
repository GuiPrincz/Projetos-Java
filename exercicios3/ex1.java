
import java.util.Scanner;

public class ex1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int senha = scanner.nextInt();

        while (senha != 2002) {
            System.out.println("Senha incorreta. Tente novamente.");
            senha = scanner.nextInt();
        }
        System.out.println("Senha correta. Acesso permitido.");
    }
}
