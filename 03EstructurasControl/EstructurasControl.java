/*Menú de seleccion para 14 opciones
 * 1. Bono o descuento por edad
 * 2. Convertir números de cimales a binarios
 * 3. Convertir temperaturas
 * 4. Número de positivos y negativos
 * 5. Tiendita
 * 6.
 * .
 * .
 * .
 * 14.Salir
 */
import java.util.Scanner;

public class EstructurasControl {
    public static void main (String[] args){
        /*
        1. Identificar al objeto
        2. Nombrar
        3. Crear
        */

        //-------------------Inicialización de variable------------------------//
        //Se realiza para no tener valores "basura"
        Scanner entrada = new Scanner(System.in); //Crea una instancia del objeto de la entrada por defecto de la computadora para leer caracteres.



        int op, numbinario, total, catidadproducto, num1;
        float precio, resultado = 0, compra = 0;
        String binario = "";
        String nombreproducto;
        char letra;

        do {
            System.out.println("Escoge una de las opciones siguientes: ");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");


            letra = entrada.next().charAt(0);
        } while (letra == 's');


    }
    
}
