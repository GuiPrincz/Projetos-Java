
import java.util.Scanner;

public class ex2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        
        int in = 0;
        int out = 0;

        for (int i = 0; i < num; i++) {
            int value = scanner.nextInt();
            if (value >= 10 && value <= 20) {
                in++;
            } else {
                out++;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}