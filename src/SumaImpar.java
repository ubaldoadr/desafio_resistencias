import java.util.Scanner;

public class SumaImpar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println( "ingrese el limite de su sumatoria: ");
        int n = sc.nextInt();
        int suma = 0;

        for (int i = 1; i <= n ; i+=2) {
            suma = suma + i;

        }
        System.out.println( suma);



    }
}
