package juan.fundamentosjava.estructuras;

import java.util.Scanner;
import java.io.*;

public class Ejercicio4 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        float n1, n2;
        System.out.print("Inserte el primer numero: ");
        n1 = input.nextFloat();
        System.out.print("Inserte el segundo numero: ");
        n2 = input.nextFloat();
        if (n1 > n2) {
            System.out.println("El primer numero es mayor que el otro");
        } else if (n2 > n1) {
            System.out.println("El segundo numero es mayor que el otro");
        } else {
            System.out.println("Ambos valores son iguales");
        }
    }
}
