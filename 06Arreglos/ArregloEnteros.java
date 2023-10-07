import java.util.*;
import java.util.stream.IntStream;

public class ArregloEnteros {
        Scanner entrada = new Scanner(System.in);
        int vec[] = new int[10];
        int positivos = 0, negativos = 0, pares = 0;
        int op, aprobados, reprobados; 
        double promedio = 0;

        public void menu() {
            op = 0;
            System.out.println("Escoja una de las siguientes opciones: ");
            System.out.println("1. Positivos y Negativos");
            System.out.println("2. Promedio de posiciones pares");
            System.out.println("3. Promedio de 10 calificaciones");
            System.out.println("4. Salir");
            op = entrada.nextInt();

            switch (op) {
                case 1:
                    Ejercicio1();
                    break;
                case 2:
                    Ejercicio2();
                    break;
                case 3:
                    Ejercicio3();
                    break;
            
                default:
                    if (op > 4) {
                        System.out.println("¡¡¡Ingresa una de las opciones anteriores!!!");    
                    }
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
                if (i % 2 == 0) {
                   promedio += vec[i];
                }
            }
            promedio += vec[0];
            promedio /= 6;
            System.out.println("El promedio de las posiciones pares es de: " + promedio);
        }

        public void Ejercicio3() { //Promedio de 10 números
            //Realice un programa que permita leer 10 calificaciones de una asignatura y los guarde en un array para que muestre: 
            //Imprimir todas las calificaciones. 
            //Promedio de las calificaciones. 
            //La calificación más alta y la más baja. 
            //El número de calificaciones superiores al promedio. 
            //La cantidad de alumnos aprobados y reprobados. 
            for (int i = 0; i < vec.length; i++) {
                System.out.println(String.format("Ingrese el valor %d",i+1));
                vec[i] = entrada.nextInt();
            }
            System.out.println();

            //Imprime todas las calificaciones
            System.out.print("Calificaciones ingresadas: ");
            for (int i = 0; i < vec.length; i++) {
                System.out.print(vec[i] + " ");
            }

            //Promedio de todas las calificaciones
            System.out.println();
            for (int i = 0; i < vec.length; i++) {
                promedio += vec[i];
            }
            promedio /= vec.length;
            System.out.println("Promedio: " + promedio);

            //Encuentra la calificación más baja y la más alta
            int max = IntStream.of(vec).max().orElse(Integer.MIN_VALUE);
            int min = IntStream.of(vec).min().orElse(Integer.MAX_VALUE);
            System.out.println("Calificación más alta: " + max);
            System.out.println("Calificación más baja: " + min);

            //Califficaciones superiores al promedio
            System.out.print("Calificaciones superiores al promedio: ");
            for (int i = 0; i < vec.length; i++) {
                if (vec[i] >= promedio) {
                    System.out.print(vec[i] + " ");
                }
            }

            //Cantidad de alumnos reprobados y aprobados
            System.out.println();
            for (int i = 0; i < vec.length; i++) {
                if (vec[i] >= 6) {
                    aprobados += 1;
                } else {
                    reprobados += 1;
                }
            }
            System.out.println("Aprobados: " + aprobados);
            System.out.println("Reprobados: " + reprobados);


        }
        
    
}
