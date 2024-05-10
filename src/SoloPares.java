import java.util.Scanner;

public class SoloPares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros pares que desea obtener: ");
        int limite = sc.nextInt();

        for (int i = 0; i < (limite*2) ; i+=2) {
            System.out.println( i);

        }
    }
}
