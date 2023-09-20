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



      int op, fl = 0, numbinario, total, catidadproducto, num1;
      float precio, resultado = 0, compra = 0;
      String binario = "";
      String nombreproducto;
      char letra;

      do {
			op = 0;
			System.out.println("Escoge una de las opciones siguientes: ");
			System.out.println("1. Descuento por edad");
         System.out.println("2. Convertir número entero a binario"); //Jimmy
         System.out.println("3. Convertidor de Temperaturas");
         System.out.println("4. Números Positivos y Negativos");
         System.out.println("5. Tiendita"); //Jimmy
         System.out.println("6. Area y Perimetro");
         System.out.println("7. Tabla"); //Jimmy
         System.out.println("8. Factorial");
         System.out.println("9. Dibujito"); //Jimmy
         System.out.println("10. Figura Hueca");
         System.out.println("11. Patrones de Código");
         System.out.println("12. Diamante");
         System.out.println("13. Calculadora");
         System.out.println("14. Salir");
         op = entrada.nextInt();
			System.out.print("\033[H\033[2J"); //Clear Screen

         switch (op) {
				case 1:
				//Descuento
					break;
            case 2:
            //decimal a binario
            do{
					System.out.println("Ingrese un número entero posititvo: ");
               numbinario = entrada.nextInt();
               if (numbinario > 0) {
						while(numbinario > 0){
							if (numbinario>0) {
								binario = "0" + binario;
                     }else{
								binario = "1" + binario;
                     }
							numbinario = (int)numbinario/2;
                  }
					}else if (numbinario == 0){
						binario = "0" + binario;
               }else{
						System.out.print("No se puede convertir un número negativo.");
               }
               System.out.println("El número binario es: " + binario);
               op=0;
               System.out.print("\033[H\033[2J");
               System.out.println("¿Repetir el ejercicio?");
               System.out.println("1. Sí");
               System.out.println("2. No");
               op = scan.nextInt();
               System.out.print("\033[H\033[2J"); //Clear Screen
            }while(op!=2);
					break;
				case 3:
                    
               break;
            case 4:
                    
               break;
            case 5:
                    
               break;
            case 6:
                    
               break;
         	case 7:
                    
               break;
            case 8:
                    
               break;
            case 9:
                    
               break;
            case 10:
                    
               break;
            case 11:
                    
               break;
            case 12:
                    
               break;
            case 13:
                    
               break; 
            
            default:
				if ( op > 14){ //variable usada para salir
					System.out.println("Selecciona una de las opciones anteriores.");
            }
               break;
         	}//Switch


            //letra = entrada.next().charAt(0);
        } while (letra != 14);


    }
    
}
