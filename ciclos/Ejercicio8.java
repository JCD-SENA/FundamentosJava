package juan.fundamentosjava.ciclos;

import java.util.Scanner;

/*
Modifique el algoritmo sobre el porcentaje de aumento de las guías anteriores, para que se pueda hacer el cálculo las veces que el usuario desee.
*/

public class Ejercicio8 {
    public static void main(String[] args) {
        final int percentage = 30;
        int hours;
        double salaryHour, finalSalary;
        Scanner input = new Scanner(System.in);
        boolean condition = true;
        while (condition) {
            System.out.print("Inserte el salario por hora: ");
            salaryHour = input.nextFloat();
            System.out.print("Inserte las horas trabajadas: ");
            hours = input.nextInt();
            finalSalary = (salaryHour * hours);
            finalSalary += (finalSalary / 100) * percentage;
            System.out.println("Salario final: "+finalSalary+"$\n");
            System.out.print("Continuar? (s/n): ");
            input.nextLine();
            String sn = input.nextLine();
            if (sn.toLowerCase().equals("n")) {
                condition = false;
            }
        }
    }
}
