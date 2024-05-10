import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println( "Ingrese el limite de su fibonacci: ");
        int limite = sc.nextInt();
        int a = 0;
        int b = 1;
        int auxiliar = 1;
//0 1 1 2 3 5 8 13
        for (int i = 1; i <= limite ; i++) {
                System.out.println(a);

                auxiliar = a+b;
                a = b;
                b = auxiliar;


        }




    }
}
