package juan.fundamentosjava.ciclos;

import javax.swing.JOptionPane;

/*
Cada ejemplo imprime el resultado en consola, repita cada uno de ellos pero ahora imprimiendo en pantalla usando para eso
un JOptionPane.
*/

public class Ejercicio1 {
    public static void main(String[] args) {
        int x=0;
        do {
            JOptionPane.showMessageDialog(null, "Valor de x: "+x);
            x++;
        } while (x<=10);
        
        while (x<=10) {
            JOptionPane.showMessageDialog(null, "El valor de X es: "+x);
        }
        
        for (int i=0;i<=10;i++) {
            JOptionPane.showMessageDialog(null, "El valor de i es: "+i);
        }
        
        int i = 0;
        boolean condition = true;
        for (;condition;) {
            if (i<=10) {
                JOptionPane.showMessageDialog(null, "El valor de i es: "+i);
                i++;
                condition=true;
            } else {
                condition=false;
            }
        }
    }
}