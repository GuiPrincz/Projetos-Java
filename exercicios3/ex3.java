
import java.util.Scanner;

public class ex3{
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int combustivel, alcool, gasolina, diesel;
        alcool = 0;
        gasolina = 0;
        diesel = 0;
        combustivel = scanner.nextInt();

        while (combustivel != 4) {
            if (combustivel == 1) {
                alcool++;
            } else if (combustivel == 2) {
                gasolina++;
            } else if (combustivel == 3) {
                diesel++;
            }
            combustivel = scanner.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

    }
}