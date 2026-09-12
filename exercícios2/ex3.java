
import java.util.Scanner;

public class ex3{
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a, b;

        a= sc.nextInt();
        b= sc.nextInt();

        if ((a%b == 0) || (b%a == 0)){
            System.out.println("MULTIPLO");
        }
        else {
            System.out.println("NAO MULTIPLO");
        }

    }
}