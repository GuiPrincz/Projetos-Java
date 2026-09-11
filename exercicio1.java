import java.util.Locale;
import static java.util.Locale.setDefault;

public static void main (String[] args){

    String product1 = "Computer";
    String product2 = "Office desk";

    int age = 30;
    int code = 5290;
    char gender = 'F';

    double price1 = 2100.0;
    double price2 = 650.50;
    double measure = 53.234567;

    System.out.println("Products:");
    System.err.printf("%s, which price is $ %.2f%n", product1, price1);
    System.err.printf("%s, which price is %.2f%n", product2, price2);

    System.out.println("");

    System.err.println("Record: "+age+" years old, code "+code+" and gender: "+gender);

    System.out.println("");

    System.err.printf("Measure with eight decimal places: %.8f%n", measure);
    System.err.printf("Rouded (three decimal places): %.3f%n", measure);
        setDefault(Locale.US);
    System.err.printf("US decimal point: %.3f%n", measure);

}