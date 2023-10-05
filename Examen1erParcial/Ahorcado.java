import java.util.*;
//Construye un programa que permita jugar con tus amigos AHORCADO. 
//Deberás ingresar una palabra al arreglo cada letra es una posición del arreglo,
//le darás 3 pistas al jugador, cuántas letras son, cual es la primera y última letra
//asigna puntajes y descuentos por cada equivocación o acierto

public class Ahorcado {
    String firstString, palabra, nombre;
    Scanner entrada = new Scanner(System.in);
    boolean resuelto = false, contains = false;
    //boolean[] letrasconocidas = new boolean[3];
    char letra, confirma;
    int errores = 0, score = 0;
    
    public void menu(){
        System.out.print("\033[H\033[2J"); //Clear Screen
        System.out.println();
        System.out.println("                    ¡¡¡Bienvenidos al juego de AHORCADO!!!");
        System.out.println();

        //Identifica al jugador
        System.out.print("Ingrese el nombre del jugador: ");
        nombre = entrada.nextLine(); 

        //Lee la palabra
        System.out.println();
        System.out.println(nombre + " , asegurate de que nadie vea!!!");
        System.out.println("Warning: Si se ingresa más de una palabra, se tomará solo la del principio!");
        System.out.print("Ingresa una palabra: ");
        firstString = entrada.nextLine();
        palabra = limpiarcadena(firstString);

        //Confirma los lineamientos
        if (pistas(nombre) == 's' || pistas(nombre) == 'S') {
            //Empieza el juego
            cuerpo(palabra);    
        }
        //System.out.print("\033[H\033[2J"); //Clear Screen
        System.out.println("          Gracias por jugar AHORCADO!!!");
        

    }

    public char pistas(String nombre){
        //do{
            System.out.print("\033[H\033[2J"); //Clear Screen
            confirma = 'n';
            System.out.println("A continuación se empezará el juego con 3 pistas");
            System.out.println("El número total de letras");
            System.out.println("La primera letra de la palabra");
            System.out.println("La última letra de la palabra");
            System.out.println();
            System.out.println("El juego terminará después de 5 errores");
            System.out.println();
            System.out.println(nombre + " ¿Estás de acuerdo con estos lineamientos?");
            System.out.println("Si = 's' | No = 'n'");
            confirma = entrada.next().charAt(0);
            return confirma;
        //}while (confirma != 's' || confirma != 'S');
    }

    public String limpiarcadena(String firstString){
        String[] separaTodo = firstString.split(" ");
        palabra = separaTodo[0];
        return palabra;
    }

    public void cuerpo(String palabra){
        //System.out.print("\033[H\033[2J"); //Clear Screen
        boolean[] letrasconocidas = new boolean[palabra.length()];
        boolean[] completado = new boolean[palabra.length()];
        Arrays.fill(completado, true);
        
        //Se almacena las posiciones de las letras que se conocen
        score = 0;
        errores = 0;
        letrasconocidas[0] = true;
        letrasconocidas[palabra.length()-1] = true;
        do {
            System.out.print("\033[H\033[2J"); //Clear Screen

            //Imprime cada vez la palabra con ayuda de letras conocidas
            System.out.println("La palabra tiene " + palabra.length() + " letras.");
            contains = false;
            for (int i = 0; i < palabra.length() ; i++) {
                if (letrasconocidas[i] == true) {
                    System.out.print(palabra.substring(i,i+1) + " ");    
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println("     Errores: " + errores + "     Puntaje: " + score);
            System.out.println();
            
            System.out.print("Ingresa una letra: ");
            letra = entrada.next().charAt(0);
            
            for (int i = 0; i < palabra.length(); i++) { //busca las posiciones de los caracteres del String que coinciden con la letra
                if (palabra.charAt(i) == letra) {
                    letrasconocidas[i] = true;
                    score += 1;
                    contains = true;
                }
            }

            if (contains == false) { //Si no se encontraron coincidencias en el bloque anterior, suma el error
                    errores += 1;
            }
            
            if (letrasconocidas == completado) {
                resuelto = true;
            }

        } while (resuelto == false);
        

    }
}
