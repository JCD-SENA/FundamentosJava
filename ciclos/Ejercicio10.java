package juan.fundamentosjava.ciclos;

import java.util.Scanner;

/*
Cree un algoritmo que imprima la tabla del número que ingrese el usuario, usando para esto el ciclo for, el número de resultados también debe ser definido por el usuario.
*/
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el numero: ");
        int n = input.nextInt();
        System.out.print("Ingrese la cantidad de resultados: ");
        int e = input.nextInt();
        for (int i=1;i<=e;i++) {
            System.out.println(i+" x "+n+" = "+i*n);
        }
    }
}
