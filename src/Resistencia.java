import java.util.Scanner;

public class Resistencia {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        float r1 = 0;
        float r2 = 0;
        float r3 = 0;
            do {
                    System.out.println("Ingresa el valor de r1: ");
                    r1 = sc.nextFloat();
                    if (r1 <= 0) {
                            System.out.println("Debes ingresar un valor mayor a 0");
                    }
            } while (r1 <= 0);



            do {
                    System.out.println("Ingresa el valor de r2: ");
                    r2 = sc.nextFloat();
                    if (r2 <= 0) {
                            System.out.println("Debes ingresar un valor mayor a 0");
                    }
            } while (r2 <= 0);



            do {
                    System.out.println("Ingresa el valor de r3: ");
                    r3 = sc.nextFloat();
                    if (r3 <= 0) {
                            System.out.println("Debes ingresar un valor mayor a 0");
                    }
            } while (r3 <= 0);

    r1 = 1/r1;
    r2 = 1/r2;
    r3 = 1/r3;


    float sumaResistencias = r1+r2+r3;

    float rt =1/sumaResistencias;

        System.out.printf("La resistencia total sera: %.1f ", rt);




    }
}