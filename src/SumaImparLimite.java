import java.util.Scanner;

public class SumaImparLimite {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println( "Ingrese el limite inferior de su sumatoria: ");
        int li = sc.nextInt();

        System.out.println( "Ingrese el limite superior de su sumatoria: ");
        int n = sc.nextInt();

        int suma = 0;

        if (li%2 ==0) {

           li++ ;
        }


            for (int i = li; i <= n; i += 2) {
                suma = suma + i;

            }
            System.out.println(suma);




    }
}
