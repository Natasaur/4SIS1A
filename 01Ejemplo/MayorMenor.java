//Desarrolle un algoritmo que permita leer dos valores distintos, determinar cual de los dos valores es el mayor y escribirlo.
import java.util.Scanner;

public class MayorMenor {
    public static void main(String[] args) {
        int num1, num2;
    Scanner scan = new Scanner(System.in);

    System.out.print("Ingrese el primer número: ");
    num1 = scan.nextInt();
    System.out.print("Ingrese el segundo número: ");
    num2 = scan.nextInt();

    if (num1 == num2) {
        System.out.println("Los números deben de ser diferentes para compararlos.");
    }else{
        if (num1 > num2) {
            System.out.println("El número " + num1 + " es mayor que " + num2);
        }else{
            System.out.println("El número " + num2 + " es mayor que " + num1);
        }
    }        
    }   
}