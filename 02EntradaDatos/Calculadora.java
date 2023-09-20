import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int num1,num2,op=0;
        //int res;
        Scanner scan = new Scanner(System.in);

        do {
            op=0;
            System.out.println("Seleccione una de las opciones: ");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            op = scan.nextInt();
            System.out.print("\033[H\033[2J");//clear screen

            switch (op) {
                case 1:
                    do {
                        System.out.print("Ingrese el primer número: ");
                        num1 = scan.nextInt();
                        System.out.print("Ingrese el segundo número: ");
                        num2 = scan.nextInt();
                        System.out.println(suma(num1,num2));

                        op=0;
                        System.out.println("¿Repetir el ejercicio?");
                        System.out.println("1. Sí");
                        System.out.println("2. No");
                        op = scan.nextInt();
                        System.out.print("\033[H\033[2J");
                    } while (op!=2);
                    break;
                case 2:
                    do {
                        System.out.print("Ingrese el primer número: ");
                        num1 = scan.nextInt();
                        System.out.print("Ingrese el segundo número: ");
                        num2 = scan.nextInt();
                        System.out.println(resta(num1,num2));    
                        op=0;
                        System.out.println("¿Repetir el ejercicio?");
                        System.out.println("1. Sí");
                        System.out.println("2. No");
                        op = scan.nextInt();
                        System.out.print("\033[H\033[2J");
                    } while (op!=2);
                    break;
                case 3:
                    do {
                        System.out.print("Ingrese el primer número: ");
                        num1 = scan.nextInt();
                        System.out.print("Ingrese el segundo número: ");
                        num2 = scan.nextInt();
                        System.out.println(multiplicacion(num1,num2));    
                        op=0;
                        System.out.println("¿Repetir el ejercicio?");
                        System.out.println("1. Sí");
                        System.out.println("2. No");
                        op = scan.nextInt();
                        System.out.print("\033[H\033[2J");
                    } while (op!=2);
                    break;
                case 4:
                    do {
                        System.out.print("Ingrese el primer número: ");
                        num1 = scan.nextInt();
                        System.out.print("Ingrese el segundo número: ");
                        num2 = scan.nextInt();
                        System.out.println(resta(num1,num2));    
                        op=0;
                        System.out.println("¿Repetir el ejercicio?");
                        System.out.println("1. Sí");
                        System.out.println("2. No");
                        op = scan.nextInt();
                        System.out.print("\033[H\033[2J");
                    } while (op!=2);
                    break;
            
                default:
                if (op!=5){
                    System.out.println("Selecciona una de las opciones anteriores.");
                }
                    break;
            }
            
        } while (op!=5);
    }

        public static int suma(int num1,int num2){
        int result;
        result = num1 + num2;
        return result;
    }

    public static int resta(int num1,int num2){
        int result;
        result = num1 - num2;
        return result;
    }

    public static int multiplicacion(int num1,int num2){
        int result;
        result = num1 * num2;
        return result;
    }

    public static float division(float num1,float num2){
        float result;
        result = num1 / num2;
        return result;
    }
    
}
