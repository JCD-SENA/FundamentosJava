package juan.fundamentosjava.javaI;

import javax.swing.JOptionPane;

//Esto es lo de JAVA I, ejercicio 4

public class Salario {
    public static void main(String[] args) {
        final int percentage = 30;
        float salaryHour = Float.parseFloat(JOptionPane.showInputDialog("Inserte el salario por hora"));
        int hours = Integer.parseInt(JOptionPane.showInputDialog("Inserte las horas trabajadas"));
        float finalSalary = (salaryHour * hours);
        finalSalary += (finalSalary / 100) * percentage;
        System.out.println("Salario final: "+finalSalary+"$");  
    }
}
