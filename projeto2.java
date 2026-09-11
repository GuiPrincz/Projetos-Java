
import java.util.Locale;
import static java.util.Locale.setDefault;

public static void main (String[] args){
    double x = 10.35784;
    int y = 32;
    String nome= "Maria";
    int idade = 31;
    double renda = 4000.0;

    System.out.println(y);
    System.out.printf("%.2f%n",x);
        setDefault(Locale.US);
    System.out.printf("%.2f%n",x);

    System.out.println("Resultado = " + x + " metros");
    System.err.printf("Resultado = %.2f metros %n",x);

    System.err.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
}