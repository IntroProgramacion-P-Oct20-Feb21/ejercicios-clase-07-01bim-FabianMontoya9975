/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaFinal = "";
        double nota;
        boolean bandera = true;
        String salida;
        int contador = 0;
        double promedio = 0;
        do{
            System.out.println("Ingrese calificaciones");
            nota = entrada.nextDouble();
            cadenaFinal = String.format("%s%.2f\n", cadenaFinal, nota);
            entrada.nextLine(); // limpieza de buffer
            nota = nota + nota ;
            
            System.out.println("Ingrese (si) si desea salir del ciclo ");
            salida = entrada.nextLine();
            
            if (salida.equals("si")) {
                bandera = false;
            }
            contador = contador + 1;
        }while(bandera); // (bandera==true)
        
        promedio = nota / contador;
        cadenaFinal = String.format("%s%.2f\nPromedio: ", cadenaFinal, promedio);
                
        System.out.printf("Listado de Notas\n%s\n", cadenaFinal);
    }
}
