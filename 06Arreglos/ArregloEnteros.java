import java.util.*;

public class ArregloEnteros {
        Scanner entrada = new Scanner(System.in);
        int vec[] = new int[10];
        int positivos = 0, negativos = 0, pares = 0;
        int op;

        public void menu() {
            op = 0;
            System.out.println("Escoja una de las siguientes opciones: ");
            System.out.println("1. Positivos y Negativos");
            System.out.println("2. Promedio de posiciones pares");
            op = entrada.nextInt();

            switch (op) {
                case 1:
                    Ejercicio1();
                    break;
                case 2:
                    Ejercicio2();
                    break;
            
                default:
                    System.out.println("¡¡¡Ingresa una de las opciones anteriores!!!");
                    break;
            }

        }
        
        public void Ejercicio1() { //Positivos y Negativos
            //Elabore un programa que lea por el teclado 10 números enteros y los guarde en un Array, posteriormente que calcule y muestre el promedio de los valores positivos y  de los negativos
            for (int i = 0 ; i < vec.length ; i++) {
                System.out.print("Ingrese el valor " + (i+1) + ": ");
                vec[i] = entrada.nextInt();
                if (vec[i] > 0) {
                    positivos += vec[i];                
                } else {
                    negativos += vec[i];
                }
            }
            System.out.println("La suma de los números Positivos es de: " + positivos);
            System.out.println("La suma de los números Negativos es de: " + negativos);
        }

        public void Ejercicio2() { //Promedio de posiciones pares
            //Elabore un programa que lea 10 números enteros por teclado y los guarde en un array. Calcula y muestre el promedio de los números que estén en las posiciones pares del array. 
            //Considera la primera posición del array (posición 0) como par.
            for (int i = 0; i < vec.length; i++) {
                System.out.println(String.format("Ingrese el valor %d",i+1));
                vec[i] = entrada.nextInt();
            }
            for (int i = 0; i < vec.length; i++) {
                System.out.print(vec[i] + " ");
            }

        }
        
    
}
