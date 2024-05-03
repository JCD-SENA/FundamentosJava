package juan.fundamentosjava.ciclos;

/*
Algoritmo que realice el promedio de 3 notas ingresadas por un usuario, este proceso debe repetirse las veces que el usuario desee.
*/

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        boolean condition = true;
        float a, b, c;
        while (condition) {
            System.out.print("Ingrese la primera nota: ");
            a = input.nextFloat();
            System.out.print("Ingrese la segunda nota: ");
            b = input.nextFloat();
            System.out.print("Ingrese la tercera nota: ");
            c = input.nextFloat();
            System.out.println("El promedio es: "+(a + b+ c)/3);
            input.nextLine();
            System.out.print("Continuar? (s/n): ");
            if (input.nextLine().toLowerCase().equals("n")) {
                condition = false;
            }
        }
    }
}
