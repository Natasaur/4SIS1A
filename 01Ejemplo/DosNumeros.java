import java.util.Scanner; //Librería para leer datos del teclado

public class DosNumeros {
    public static void main(String[] args) {
        int num1, num2;
        //int result;
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingresa el valor del primer número: ");
        num1 = scan.nextInt();
        System.out.print("Ingresa el valor del segundo número: ");
        num2 = scan.nextInt();
        System.out.println();

        if (num2 == 0) {
            System.out.println("No se puede efectuar una division por cero.");   
        }else{
            System.out.println("Suma = " + suma(num1,num2));
            System.out.println("Resta = " + resta(num1,num2));
            System.out.println("Multiplicación = " + multiplicacion(num1,num2));
            System.out.println("División = " + division(num1,num2));
        }
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
