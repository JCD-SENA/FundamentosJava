package juan.fundamentosjava.ciclos;

import java.io.IOException;
import java.util.Scanner;

/*
Modifique la clase anterior para que realice la suma de los primeros n números naturales ingresados por el usuario.
*/

public class Ejercicio4 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int i=0, e=0;
        System.out.print("Ingrese un numero: ");
        int n = input.nextInt();
        do {
            e += i++;
        } while (i<=n);
        System.out.println(e);
        i = 0;
        e = 0;
        System.out.print("Ingrese un numero: ");
        n = input.nextInt();
        while (i<=n) {
            e += i++;
        }
        System.out.println(e);
        e = 0;
        System.out.print("Ingrese un numero: ");
        n = input.nextInt();
        for (i=0;i<=n;i++) {
            e += i;
        }
        System.out.println(e);
    }
}
