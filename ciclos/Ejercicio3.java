package juan.fundamentosjava.ciclos;

import java.io.IOException;

/*
Cree una clase donde desarrolle un programa que permita obtener la suma de los primeros 10 números naturales, esto debe realizarse usando los 3 ciclos 
explicados anteriormente, verifique el funcionamiento y compárelos.
*/

public class Ejercicio3 {
    public static void main(String[] args) throws IOException {
        int i=0, e=0;
        do {
            e += i++;
        } while (i<=10);
        System.out.println(e);
        i = 0;
        e = 0;
        while (i<=10) {
            e += i++;
        }
        System.out.println(e);
        e = 0;
        for (i=0;i<=10;i++) {
            e += i;
        }
        System.out.println(e);
    }
}
