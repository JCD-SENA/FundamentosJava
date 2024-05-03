package juan.fundamentosjava;

import javax.swing.JOptionPane;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.DataInputStream;

import java.util.Scanner;
import java.io.*;

/*
Esto es de Java II
Haga un algoritmo que permita imprimir el resultado del ejemplo propuesto sobre la precedencia de operadores de la guía anterior, pero deberá solicitar los valores aplicando cada una de las técnicas vistas en esta guía.
*/

public class Actividad2 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int a, b, c, d, e, f, g, h, i, j, k, l;
        System.out.print("Inserte el primer valor: ");
        a = input.nextInt();
        System.out.print("Inserte el segundo valor: ");
        b = input.nextInt();
        System.out.print("Inserte el tercer valor: ");
        c = input.nextInt();
        System.out.print("Inserte el cuarto valor: ");
        d = input.nextInt();
        System.out.print("Inserte el quinto valor: ");
        e = input.nextInt();
        System.out.print("Inserte el sexto valor: ");
        f = input.nextInt();
        System.out.print("Inserte el septimo valor: ");
        g = input.nextInt();
        System.out.print("Inserte el octavo valor: ");
        h = input.nextInt();
        System.out.print("Inserte el noveno valor: ");
        i = input.nextInt();
        System.out.print("Inserte el decimo valor: ");
        j = input.nextInt();
        System.out.print("Inserte el onceabo valor: ");
        k = input.nextInt();
        System.out.print("Inserte el doceabo valor: ");
        l = input.nextInt();
        System.out.println(a/b+c-d+e*f*g-h/i+j-k*l);
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Inserte el primer valor: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Inserte el segundo valor: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Inserte el tercer valor: "));
        d = Integer.parseInt(JOptionPane.showInputDialog("Inserte el cuarto valor: "));
        e = Integer.parseInt(JOptionPane.showInputDialog("Inserte el quinto valor: "));
        f = Integer.parseInt(JOptionPane.showInputDialog("Inserte el sexto valor: "));
        g = Integer.parseInt(JOptionPane.showInputDialog("Inserte el septimo valor: "));
        h = Integer.parseInt(JOptionPane.showInputDialog("Inserte el octavo valor: "));
        i = Integer.parseInt(JOptionPane.showInputDialog("Inserte el noveno valor: "));
        j = Integer.parseInt(JOptionPane.showInputDialog("Inserte el decimo valor: "));
        k = Integer.parseInt(JOptionPane.showInputDialog("Inserte el onceabo valor: "));
        l = Integer.parseInt(JOptionPane.showInputDialog("Inserte el doceabo valor: "));
        System.out.println(a/b+c-d+e*f*g-h/i+j-k*l);
        
        DataInputStream input2=new DataInputStream(System.in);
        System.out.print("Inserte el primer valor: ");
        a = Integer.parseInt(input2.readLine());
        System.out.print("Inserte el segundo valor: ");
        b = Integer.parseInt(input2.readLine());
        System.out.print("Inserte el tercer valor: ");
        c = Integer.parseInt(input2.readLine());
        System.out.print("Inserte el cuarto valor: ");
        d = Integer.parseInt(input2.readLine());
        System.out.print("Inserte el quinto valor: ");
        e = Integer.parseInt(input2.readLine());
        System.out.print("Inserte el sexto valor: ");
        f = Integer.parseInt(input2.readLine());
        System.out.print("Inserte el septimo valor: ");
        g = Integer.parseInt(input2.readLine());
        System.out.print("Inserte el octavo valor: ");
        h = Integer.parseInt(input2.readLine());
        System.out.print("Inserte el noveno valor: ");
        i = Integer.parseInt(input2.readLine());
        System.out.print("Inserte el decimo valor: ");
        j = Integer.parseInt(input2.readLine());
        System.out.print("Inserte el onceabo valor: ");
        k = Integer.parseInt(input2.readLine());
        System.out.print("Inserte el doceabo valor: ");
        l = Integer.parseInt(input2.readLine());
        System.out.println(a/b+c-d+e*f*g-h/i+j-k*l);
        
        BufferedReader input3 = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Inserte el primer valor: ");
        a = Integer.parseInt(input3.readLine());
        System.out.print("Inserte el segundo valor: ");
        b = Integer.parseInt(input3.readLine());
        System.out.print("Inserte el tercer valor: ");
        c = Integer.parseInt(input3.readLine());
        System.out.print("Inserte el cuarto valor: ");
        d = Integer.parseInt(input3.readLine());
        System.out.print("Inserte el quinto valor: ");
        e = Integer.parseInt(input3.readLine());
        System.out.print("Inserte el sexto valor: ");
        f = Integer.parseInt(input3.readLine());
        System.out.print("Inserte el septimo valor: ");
        g = Integer.parseInt(input3.readLine());
        System.out.print("Inserte el octavo valor: ");
        h = Integer.parseInt(input3.readLine());
        System.out.print("Inserte el noveno valor: ");
        i = Integer.parseInt(input3.readLine());
        System.out.print("Inserte el decimo valor: ");
        j = Integer.parseInt(input3.readLine());
        System.out.print("Inserte el onceabo valor: ");
        k = Integer.parseInt(input3.readLine());
        System.out.print("Inserte el doceabo valor: ");
        l = Integer.parseInt(input3.readLine());
        System.out.println(a/b+c-d+e*f*g-h/i+j-k*l);
    }
}