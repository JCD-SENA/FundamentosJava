package juan.fundamentosjava.ciclos;

/*
Elabore un programa que imprima los números impares del  1 al 20, use el ciclo que desee.
*/

public class Ejercicio5 {
    public static void main(String[] args) {
        for (int i=1;i<=20;i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }
    }
}