
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        MiniCalculadoraEjemplo calc = new MiniCalculadoraEjemplo();

        int opcion;

        do {
            System.out.println("\n--- MENÚ DE CALCULADORA ---");
            System.out.println("1. Calcular Raíz Cuadrada");
            System.out.println("2. Calcular Valor Absoluto");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número: ");
                    double numRaiz = teclado.nextDouble();
                    System.out.println("Resultado: " + calc.raizCuadrada(numRaiz));
                    break;

                case 2:
                    System.out.print("Ingrese el número: ");
                    double numAbs = teclado.nextDouble();
                    System.out.println("Resultado: " + calc.valorAbsoluto(numAbs));
                    break;

                case 3:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (opcion != 3);

        teclado.close();
    }
}