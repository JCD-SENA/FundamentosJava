package juan.fundamentosjava.estructuras;

import java.util.Scanner;
import java.io.*;

public class Ejercicio3 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int boughtItems;
        float price, totalPrice;
        System.out.print("Ingrese la cantidad de items comprados: ");
        boughtItems = input.nextInt();
        System.out.print("Ingrese el precio de los items individuales: ");
        price = input.nextFloat();
        totalPrice = boughtItems * price;
        if (totalPrice > 50000) {
            totalPrice = (totalPrice / 100) * 110;
        }
        System.out.println("Precio final: "+totalPrice+"$");
    }
}
