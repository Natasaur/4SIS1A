import java.util.*;

public class Cadena {
    Scanner entrada = new Scanner(System.in);

    public void cadenas() {
        String s1 = "Esto es una cadena de texto.";

        //Imprimir una cadena
        System.out.println("Tamaño: " + s1.length());

        //Saber si una cadena empieza o finaliza con "   "
        System.out.println("V o F | La cadena inicia con Hola? " + s1.startsWith("Hola"));
        System.out.println("V o F | La cadena finaliza con la palabra chocolate? " + s1.endsWith("chocolatito"));

        //Asignar una cadena
        System.out.println("Ingresa una palabra: ");
        String s2 = entrada.nextLine();

        //Obtener el índice de una subcadena
        //Una subcadena es un String contenido en un String más grande
        System.out.println("Parte de una subcadena de s1 es: " + s1.indexOf("cadena"));

        //Sustraer palabras
        String letra = "c";
        System.out.println(letra == s1.substring(12,13));
        //System.out.println("Primera parte de s1: " + s1.substring(12,13));
        //System.out.println("Segunda parte de s1: " + s1.substring(14,20));

        //Convertir una variable cualquiera en String
        int valor = 24;
        String s3 = String.valueOf(valor);
        System.out.println("Así es como se convierte un valor de: " + valor + " en una cadena " + s3);

        //Convertir un String a cualquier valor
        //String a int
        String s4 = "20";
        int numero = Integer.parseInt(s4);
        System.out.println("Así es como se convierte una cadena: " + s4 + " en un valor " + numero);
        //String a double
        String s5 = "432.684"; //número como String
        double numero1 = Double.parseDouble(s5); //número como double
        System.out.println(numero1); //numero antes de la operacion
        numero1 = valor + numero1;
        System.out.println(numero1); //numero despues de la operacion

        //Otra forma de convertir un entero a una cadena
        Integer x = 5;
        System.out.println("El valor de " + x.toString() + " ahora es una cadena");
        System.out.println("Otra forma de transformarlo " + Integer.toString(12) + " ahora es una cadena");
    }
}
