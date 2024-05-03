package juan.fundamentosjava.estructuras;

import java.util.Scanner;
import java.io.*;

public class Ejercicio5 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int edad;
        System.out.print("Inserte la edad: ");
        edad = input.nextInt();
        if (edad >= 18) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona es menor de edad");
        }
    }
}
