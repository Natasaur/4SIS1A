
import java.util.Scanner;
import java.util.*;

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

      int op, flag, numbinario, total, cantidadproducto, num1, edad, fahrenheit, n, positivos, negativos, base, altura, area, radio;
      float precio, resultado = 0, compra = 0;
      double celsius, kelvin, rankine, volumen, hipotenusa, perimetro;
      String binario = "";
      String nombreproducto;
      char letra;
      final double PI = 3.1416;

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
            do{
               System.out.print("Ingrese su edad: ");
               edad = entrada.nextInt();

               if (edad > 65) {
                  System.out.println("Se aplica descuento del 40%.");
               } else if (edad < 21) {
                  System.out.println("¿Sus padres son socios?");
                  System.out.println("'Si' = s     'No' = n");
                  letra = entrada.next().charAt(0);
                  if (letra == 's' || letra == 'S') {
                     System.out.println("Se aplica descuento del 45%.");
                  } else {
                     System.out.println("Se aplica descuento del 25%.");
                  }
               } else {
                  System.out.println("Se aplica descuento del 25%.");
               }

               op=0;
               System.out.println("");
               System.out.println("¿Repetir el ejercicio?");
               System.out.println("1. Sí");
               System.out.println("2. No");
               op = entrada.nextInt();
               System.out.print("\033[H\033[2J"); //Clear Screen
            }while(op!=2);
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
               System.out.println("");
               System.out.println("¿Repetir el ejercicio?");
               System.out.println("1. Sí");
               System.out.println("2. No");
               op = entrada.nextInt();
               System.out.print("\033[H\033[2J"); //Clear Screen
            }while(op!=2);
					break;
				case 3:
            // Convertidor de temperaturas
            do{
               flag = 0;
               System.out.print("Ingrese los grados Fahrenheit a convertir; ");
               fahrenheit = entrada.nextInt();
               System.out.println("Seleccione alguna de las siguientes opciones: ");
               System.out.println("1. Celsius");
               System.out.println("2. Kelvin");
               System.out.println("3. Rankine");
               flag = entrada.nextInt();
               switch (flag) {
                  case 1:
                  celsius = fahrenheit * -17.77;
                  System.out.println("Fahrenheit: " + fahrenheit);
                  System.out.println("Celsius: " + celsius);
                     break;
                  case 2:
                  kelvin = fahrenheit * 255.372;
                  System.out.println("Fahrenheit: " + fahrenheit);
                  System.out.println("Kelvin: " + kelvin);
                     break;
                  case 3:
                  rankine = fahrenheit * 491.67;
                  System.out.println("Fahrenheit: " + fahrenheit);
                  System.out.println("Rankine: " + rankine);
                     break;
               
                  default:
                  if ( flag > 3 || flag < 1 ){ //variable usada para salir
					System.out.println("Selecciona una de las opciones anteriores.");
            }
                     break;
               }

               op=0;
               System.out.println("");
               System.out.println("¿Repetir el ejercicio?");
               System.out.println("1. Sí");
               System.out.println("2. No");
               op = entrada.nextInt();
               System.out.print("\033[H\033[2J"); //Clear Screen
            }while(op!=2);
                    
               break;
            case 4:
            do{
               //Positivos negativos
               positivos = 0;
               negativos = 0;
               System.out.print("Ingrese la cantidad de números a ingresar: ");
               n = entrada.nextInt();
               System.out.println("Ingrese sus números consecutivamente: ");
               for (int i = 0; i < n; i++) {
                  num1 = entrada.nextInt();
                  if (num1 > 0) {
                     positivos = positivos + 1;
                  } else if (num1 < 0) {
                     negativos = negativos + 1;
                  }
               }
               System.out.println("Positivos: " + positivos);
               System.out.println("Negativos: " + negativos);

               op=0;
               System.out.println("");
               System.out.println("¿Repetir el ejercicio?");
               System.out.println("1. Sí");
               System.out.println("2. No");
               op = entrada.nextInt();
               System.out.print("\033[H\033[2J"); //Clear Screen
            }while(op!=2);                  
               break;
            case 5:
            do{
               //Tiendita
               System.out.println("Ingrese la cantidad de productos: ");
               total = entrada.nextInt();
               for (int i = 0; i <= total; i++) {
                  System.out.println("Ingrese el nombre del producto: ");
                  nombreproducto = entrada.next();
                  System.out.println("Ingrese el precio del producto: ");
                  precio = entrada.nextFloat();
                  System.out.println("Ingrese la cantidad del producto: ");
                  cantidadproducto = entrada.nextInt();
                  resultado = precio * cantidadproducto;
                  compra = compra + resultado;
               }
               System.out.println("El total de la compra es: " + compra);


               op=0;
               System.out.println("");
               System.out.println("¿Repetir el ejercicio?");
               System.out.println("1. Sí");
               System.out.println("2. No");
               op = entrada.nextInt();
               System.out.print("\033[H\033[2J"); //Clear Screen
            }while(op!=2);                    
               break;
            case 6:
            do{
               //Area, perimetro y volumen
               //System.out.print(PI);
               flag = 0;
               System.out.println("Seleccione alguna de las siguientes opciones: ");
               System.out.println("1. Área y Perímetro de un rectángulo.");
               System.out.println("2. Área y Perímetro de un triángulo.");
               System.out.println("3. Volúmen de una esfera.");
               System.out.println("4. Volúmen de un cilindro.");
               flag = entrada.nextInt();
               switch (flag) {
                  case 1:
                  System.out.println("Ingrese el valor de la base: ");
                  base = entrada.nextInt();
                  System.out.println("Ingrese el valor de la altura: ");
                  altura = entrada.nextInt();
                  area = base * altura;
                  perimetro = 2 * (base + altura);
                  System.out.println("Área: " + area);
                  System.out.println("Perímetro: " + perimetro);
                     break;
                  case 2:
                  System.out.println("Ingrese el valor de la base: ");
                  base = entrada.nextInt();
                  System.out.println("Ingrese el valor de la altura: ");
                  altura = entrada.nextInt();
                  area = (base * altura)/2;
                  hipotenusa = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
                  perimetro = base + altura + hipotenusa;
                  System.out.println("Área: " + area);
                  System.out.println("Perímetro: " + perimetro);
                     break;
                  case 3:
                  System.out.println("Ingrese el valor del radio: ");
                  radio = entrada.nextInt();
                  volumen = (4/3) * PI * Math.pow(radio, 3);
                  System.out.println("Volúmen: " + volumen);
                     break;
                  case 4:
                  System.out.println("Ingrese el valor del radio: ");
                  radio = entrada.nextInt();
                  System.out.println("Ingrese el valor de la altura: ");
                  altura = entrada.nextInt();
                  volumen = PI * Math.pow(radio, 2) * altura;
                  System.out.println("Volúmen: " + volumen);
                     break;
               
                  default:
                  if ( flag > 3 || flag < 1 ){ //variable usada para salir
				   	System.out.println("Selecciona una de las opciones anteriores.");
                  }
                     break;
               }

               op=0;
               System.out.println("");
               System.out.println("¿Repetir el ejercicio?");
               System.out.println("1. Sí");
               System.out.println("2. No");
               op = entrada.nextInt();
               System.out.print("\033[H\033[2J"); //Clear Screen
            }while(op!=2);  
               break;
         	case 7:
            do{

               op=0;
               System.out.println("");
               System.out.println("¿Repetir el ejercicio?");
               System.out.println("1. Sí");
               System.out.println("2. No");
               op = entrada.nextInt();
               System.out.print("\033[H\033[2J"); //Clear Screen
            }while(op!=2);   
               break;
            case 8:
            do{

               op=0;
               System.out.println("");
               System.out.println("¿Repetir el ejercicio?");
               System.out.println("1. Sí");
               System.out.println("2. No");
               op = entrada.nextInt();
               System.out.print("\033[H\033[2J"); //Clear Screen
            }while(op!=2);  
               break;
            case 9:
            do{

               op=0;
               System.out.println("");
               System.out.println("¿Repetir el ejercicio?");
               System.out.println("1. Sí");
               System.out.println("2. No");
               op = entrada.nextInt();
               System.out.print("\033[H\033[2J"); //Clear Screen
            }while(op!=2);  
               break;
            case 10:
            do{

               op=0;
               System.out.println("");
               System.out.println("¿Repetir el ejercicio?");
               System.out.println("1. Sí");
               System.out.println("2. No");
               op = entrada.nextInt();
               System.out.print("\033[H\033[2J"); //Clear Screen
            }while(op!=2);   
               break;
            case 11:
            do{

               op=0;
               System.out.println("");
               System.out.println("¿Repetir el ejercicio?");
               System.out.println("1. Sí");
               System.out.println("2. No");
               op = entrada.nextInt();
               System.out.print("\033[H\033[2J"); //Clear Screen
            }while(op!=2);  
               break;
            case 12:
            do{

               op=0;
               System.out.println("");
               System.out.println("¿Repetir el ejercicio?");
               System.out.println("1. Sí");
               System.out.println("2. No");
               op = entrada.nextInt();
               System.out.print("\033[H\033[2J"); //Clear Screen
            }while(op!=2);   
               break;
            case 13:
            do{

               op=0;
               System.out.println("");
               System.out.println("¿Repetir el ejercicio?");
               System.out.println("1. Sí");
               System.out.println("2. No");
               op = entrada.nextInt();
               System.out.print("\033[H\033[2J"); //Clear Screen
            }while(op!=2);  
               break; 
            
            default:
				if ( op > 14){ //variable usada para salir
					System.out.println("Selecciona una de las opciones anteriores.");
            }
               break;
         	}//Switch


        } while (op != 14); //letra = entrada.next().charAt(0);


    }
    
}
