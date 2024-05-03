package juan.fundamentosjava;

import javax.swing.JOptionPane;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.DataInputStream;

import java.util.Scanner;
import java.io.*;

/*
Modifique el  programa que permita calcular el sueldo final de un empleado, tenga en cuenta que el sueldo depende de un incremento del 30%, haga el algoritmo definiendo el porcentaje como una constante pero solicite los datos de entrada mediante cada una de las técnicas vistas en esta guía.
*/

public class FundamentosJava {
    public static void main(String[] args) throws IOException {
        final int percentage = 30;
        float salaryHour = Float.parseFloat(JOptionPane.showInputDialog("Inserte el salario por hora"));
        int hours = Integer.parseInt(JOptionPane.showInputDialog("Inserte las horas trabajadas"));
        float finalSalary = (salaryHour * hours);
        finalSalary += (finalSalary / 100) * percentage;
        System.out.println("Salario final: "+finalSalary+"$\n");
        
        Scanner input = new Scanner(System.in);
        System.out.print("Inserte el salario por hora: ");
        salaryHour = input.nextFloat();
        System.out.print("Inserte las horas trabajadas: ");
        hours = input.nextInt();
        finalSalary = (salaryHour * hours);
        finalSalary += (finalSalary / 100) * percentage;
        System.out.println("Salario final: "+finalSalary+"$\n");
        
        DataInputStream input2=new DataInputStream(System.in);
        System.out.print("Inserte el salario por hora: ");
        salaryHour = Float.parseFloat(input2.readLine());
        System.out.print("Inserte las horas trabajadas: ");
        hours = Integer.parseInt(input2.readLine());
        finalSalary = (salaryHour * hours);
        finalSalary += (finalSalary / 100) * percentage;
        System.out.println("Salario final: "+finalSalary+"$\n");
        
        BufferedReader input3 = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Inserte el salario por hora: ");
        salaryHour = Float.parseFloat(input3.readLine());
        System.out.print("Inserte las horas trabajadas: ");
        hours = Integer.parseInt(input3.readLine());
        finalSalary = (salaryHour * hours);
        finalSalary += (finalSalary / 100) * percentage;
        System.out.println("Salario final: "+finalSalary+"$\n");
    }
}