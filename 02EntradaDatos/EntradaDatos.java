//import java.io.*;
import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        char nombre;
        System.out.print("Ingresa una letra: ");

        //nombre = (char)System.in.read();
        Scanner entrada = new Scanner(System.in);
        nombre = entrada.next().charAt(0);

        System.out.println("Hola " + nombre + ", Bienvenido!!!");
    }
}
