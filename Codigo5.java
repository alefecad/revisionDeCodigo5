/*
 * Este programa de Java simula un juego que decide si un número es “afortunado” o no. 
 * El programa solicita al usuario que ingrese un número. 
 * El código revisa cada dígito (número individual) del número que se introdujo
 * Si el dígito es 3, 7, 8 o 9 lo considera afortunado.
 * Si el dígito es 0, 1, 2, 4, 5 o 6 se considera no afortunado. 
 * Si hay más dígitos que se consideran afortunados que otros dígitos no afortunados 
 * dentro del número que se ingreso, se determina que el número es afortunado.
 * */

import java.util.Scanner; // Se importa la clase Scanner

public class Codigo5 {
    public static void main(String[] args) { // Se agrega un método main para que el programa pueda ejecutarse
        Scanner s = new Scanner(System.in); // Se corrige la declaración del objeto Scanner apra que tome System.in como argumento
        System.out.print("Introduzca un número: "); // Se corrige el error de sintáxis, faltaba una doble comilla al final de la cadena
        String ni = s.nextLine();
        int c = Integer.parseInt(ni); // Se convierte la cadena ni a un entero antes de asignarla a c

        int afo = 0;
        int noAfo = 0;

        int num = c; // Se cambia el nombre de la variable ni a num, debido a que ni es una cadena y se esta realizando operaciones aritméticas 
        while (num > 0) {
            int digito = num % 10;
            if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
                afo++;
            } else {
                noAfo++;
            }

            num /= 10;
        }
        if (afo > noAfo) {
            System.out.println("El " + c + " es un número afortunado."); // Se corrige el error de sintáxis, había un error de escritura en println
        } else {
            System.out.println("El " + c + " no es un número afortunado.");
        }
        s.close(); // Se cierra el Scanner para evitar fugas de memoria
    }    
}
