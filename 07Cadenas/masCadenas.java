import java.util.*;

public class masCadenas {
    Scanner entrada = new Scanner(System.in);

    public void masFuncionesCadena(){
        //Declaración de cadenas
        String s1 = new String("Había una vez un patito");
        String s2 = "Harry Potter es mágico ";
        String s3 = "Feliz no cumpleaños";
        String s4 = "FELIZ NO CUMPLEAÑOS";

        //Concatenar cadenas
        String salida = "Cadenas a concatenar: " + s1 + "\n" + s2 + "\n" + s3 + "\n";


        //Comprobar si dos cadenas son iguales
        System.out.println("Compara si s1 es igual a la cadena Solo juguito contigo");
        if( s1.equals("Solo juguito contigo") ){
            //si es verdad
            salida += "Si es igual a la cadena \n";
            System.out.println(salida);
        }else{
            //sino
            salida += "No es la misma cadena \n";
            System.out.println(salida);
        }

        if(s3.equals(s4)){
            //si es verdad
            salida += "Si es igual a la cadena \n";
            System.out.println(salida);
        }else{
            salida += "No es la misma cadena \n";
            System.out.println(salida);
        }

        //si no me importa distinguir mayusculas de minusculas y quiero saber si dice
        //el mismo mensaje
        if(s3.equalsIgnoreCase(s4)){
            //si es verdad
            salida += "Si es igual a la cadena \n";
            System.out.println(salida);
        }else{
            salida += "No es la misma cadena \n";
            System.out.println(salida);
        }

        //metodo compareTo

        //salida += "\n s3 compareTo s4 " + s3.compareTo(s4);
        //salida += "\n s1 compareTo s4 " + s1.compareTo(s4);
        salida += "\n s3 compareTo s2 " + s3.compareTo(s2);

        /* 
         
        F e l i z n o  c u m p l ea ñ o s
        H a r r y P o po t e e s  m a g i co
         * 
         * 
        */


        System.out.println(salida);

        //obtener la posicion de un caracter

        String s5 = "Patito patito color de cafe";

        int pos = 0;

        pos = s5.indexOf('t', pos+1);

        System.out.println("la segunda t esta en la posicion " + pos);

    }
}
