package juan.fundamentosjava.ciclos;

import java.io.IOException;
import java.util.Scanner;

/*
Algoritmo que imprima todos los números que ingrese el usuario, si ingresa cero termine, haga el algoritmo con el ciclo que desee
*/

public class Ejercicio6 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n = -1;
        do {
            System.out.print("Ingrese un numero: ");
            n = input.nextInt();
        } while (n!=0);
    }
}
