package juan.fundamentosjava.ciclos;

/*
Cree un algoritmo que imprima los primeros  10 resultados de la tabla del 5, usando para esto el ciclo while.
*/

public class Ejercicio9 {
    public static void main(String[] args) {
        int i = 1;
        while (i<=10) {
            System.out.println(i+" x 5 = "+(i++*5));
        }
    }
}
